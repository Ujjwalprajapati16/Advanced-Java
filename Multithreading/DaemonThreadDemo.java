

public class DaemonThreadDemo extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread");
        } else {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        System.out.println("main thread");

        DaemonThreadDemo daemonThreadDemo = new DaemonThreadDemo();
        daemonThreadDemo.setDaemon(true);
        daemonThreadDemo.start();
    }
}
