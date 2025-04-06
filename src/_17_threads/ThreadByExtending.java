package _17_threads;

/**
 * Creating a thread by extending the Thread class.
 */
public class ThreadByExtending extends Thread {
    @Override
    public void run() {
        // Code to be executed in a separate thread
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadByExtending thread1 = new ThreadByExtending();
        thread1.setName("MyThread-1");
        thread1.start(); // Starts the thread and calls run() internally
    }
}
