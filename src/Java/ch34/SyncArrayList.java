package Java.ch34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SyncArrayList {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> lst = Collections.synchronizedList(new ArrayList<Integer>());
        for(int i= 0;i< 16; i++)
            lst.add(i);
        System.out.println(lst);

        Runnable task = () -> {
            synchronized (lst) {    //이 영역 실행시 lst에 다른 쓰레드 접근 불가
                ListIterator<Integer> itr = lst.listIterator();
                while (itr.hasNext())
                    itr.set(itr.next() + 1);
            }
        };
        ExecutorService exr = Executors.newFixedThreadPool(3);
        exr.submit(task);
        exr.submit(task);
        exr.submit(task);

        exr.shutdown();
        exr.awaitTermination(100, TimeUnit.SECONDS);
        System.out.println(lst);
    }
}
