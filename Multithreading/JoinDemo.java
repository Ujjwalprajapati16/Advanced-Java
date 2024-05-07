

public class JoinDemo extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("child thread " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinDemo demo = new JoinDemo();
        demo.start();
        demo.join();

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main thread " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
