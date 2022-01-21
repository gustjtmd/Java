package Java.ch34;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void main(String[] args) {
        Runnable task = () -> { //쓰레드에게 시킬 작업
            int n1 = 10;
            int n2 = 20;
            String name = Thread.currentThread().getName();
            System.out.println(name + ": "+(n1+n2));
        };
        ExecutorService exr = Executors.newSingleThreadExecutor();
        exr.submit(task);   //쓰레드 풀에 작업을 전달

        System.out.println("End : "+Thread.currentThread().getName());
        exr.shutdown();
    }
}
