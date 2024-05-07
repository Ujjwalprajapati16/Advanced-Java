

public class ThreadPriority extends Thread {
    public void run() {
        System.out.println("Child Thread");
        System.out.println("Child thread priority : " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println("Main Thread old priority : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println("Main Thread new priority : " + Thread.currentThread().getPriority());

        ThreadPriority threadPriority = new ThreadPriority();
        threadPriority.start();
    }
}
