

public class InterruptedDemo extends Thread {
    public void run() {
        try {
            for(int i=1; i<=5; i++){
                System.out.println(i);
                Thread.sleep(1000);
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("Thread is interrupted");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Thread is interrupted");
        }
    }
    public static void main(String[] args) {
        InterruptedDemo demo = new InterruptedDemo();
        demo.start();
        demo.interrupt();
    }
}
