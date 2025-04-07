package _18_multithreading;

/**
 * This class demonstrates:
 * 1. Thread Synchronization using synchronized methods and blocks
 * 2. wait() and notify() mechanism
 * 3. A simple Deadlock scenario
 */

class SharedPrinter {
    synchronized void printNumbers(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class SyncThread1 extends Thread {
    SharedPrinter printer;

    SyncThread1(SharedPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        synchronized (printer) {
            printer.printNumbers(2);
        }
    }
}

class SyncThread2 extends Thread {
    SharedPrinter printer;

    SyncThread2(SharedPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        synchronized (printer) {
            printer.printNumbers(5);
        }
    }
}

class WaitNotifyData {
    boolean isReady = false;

    synchronized void produce() {
        try {
            System.out.println("Producing data...");
            Thread.sleep(1000);
            isReady = true;
            System.out.println("Data produced. Notifying...");
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void consume() {
        try {
            while (!isReady) {
                System.out.println("Waiting for data...");
                wait();
            }
            System.out.println("Consuming data now.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ResourceA {}
class ResourceB {}

class DeadlockDemo {
    final ResourceA a = new ResourceA();
    final ResourceB b = new ResourceB();

    public void createDeadlock() {
        Thread t1 = new Thread(() -> {
            synchronized (a) {
                System.out.println("Thread 1: locked ResourceA");
                try { Thread.sleep(100); } catch (Exception ignored) {}
                synchronized (b) {
                    System.out.println("Thread 1: locked ResourceB");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (b) {
                System.out.println("Thread 2: locked ResourceB");
                try { Thread.sleep(100); } catch (Exception ignored) {}
                synchronized (a) {
                    System.out.println("Thread 2: locked ResourceA");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

public class MultithreadingExamples {
    public static void main(String[] args) {

        // Synchronization Example
        System.out.println("\n--- Synchronized Threads Example ---");
        SharedPrinter printer = new SharedPrinter();
        new SyncThread1(printer).start();
        new SyncThread2(printer).start();

        // Wait/Notify Example
        System.out.println("\n--- Wait/Notify Example ---");
        WaitNotifyData data = new WaitNotifyData();
        Thread producer = new Thread(() -> data.produce());
        Thread consumer = new Thread(() -> data.consume());

        consumer.start();
        producer.start();

        // Deadlock Example
        System.out.println("\n--- Deadlock Example ---");
        new DeadlockDemo().createDeadlock();
    }
}
