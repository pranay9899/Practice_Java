package _17_threads;

/**
 * Demonstrates basic thread lifecycle: New -> Runnable -> Running -> Terminated
 */
class LifecycleThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + getName() + " is running...");
            Thread.sleep(1000); // Simulates work and puts thread in TIMED_WAITING state
            System.out.println("Thread " + getName() + " completed.");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }
}

public class ThreadLifecycleDemo {
    public static void main(String[] args) throws InterruptedException {
        LifecycleThread thread = new LifecycleThread();
        System.out.println("Thread state before start: " + thread.getState()); // NEW

        thread.start();
        System.out.println("Thread state after start: " + thread.getState()); // RUNNABLE

        Thread.sleep(500); // Allow thread to move into TIMED_WAITING
        System.out.println("Thread state during sleep: " + thread.getState());

        thread.join(); // Wait for thread to finish
        System.out.println("Thread state after termination: " + thread.getState()); // TERMINATED
    }
}
