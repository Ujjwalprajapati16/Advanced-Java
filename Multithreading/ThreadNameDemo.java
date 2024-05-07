

public class ThreadNameDemo {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("hello world");
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread());
    }
}
