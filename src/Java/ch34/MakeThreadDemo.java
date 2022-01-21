package Java.ch34;

public class MakeThreadDemo {
    public static void main(String[] args) {
        Runnable tast = () -> {
            int n1 = 10;
            int n2 = 20;
            String name = Thread.currentThread().getName();
            System.out.println(name +": "+(n1+n2));
        };

        Thread t = new Thread(tast,"승현이의 쓰레드");
        t.start();
        System.out.println("End : "+ Thread.currentThread().getName());
    }
}
