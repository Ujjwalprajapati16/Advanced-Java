package Multithreading;

public class SleepDemo extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        SleepDemo demo = new SleepDemo();
        demo.start();
    }
}
