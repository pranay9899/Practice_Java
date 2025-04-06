package _17_threads;

/**
 * Creating a thread by implementing the Runnable interface.
 */
public class ThreadByRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadByRunnable task = new ThreadByRunnable();
        Thread thread2 = new Thread(task);
        thread2.setName("Runnable-Thread");
        thread2.start();
    }
}
