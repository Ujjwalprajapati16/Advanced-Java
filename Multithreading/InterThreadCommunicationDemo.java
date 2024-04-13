class TotalEarnings extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 10; i++) {
                total = total + 100;
            }
            this.notify();
        }
    }
}

public class InterThreadCommunicationDemo {
    public static void main(String[] args) {
        TotalEarnings te = new TotalEarnings();
        te.start();

        synchronized (te) {
            try {
                te.wait();
                System.out.println("Total Earnings : " + te.total + " rs");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
