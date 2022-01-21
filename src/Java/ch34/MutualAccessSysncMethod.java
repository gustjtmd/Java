package Java.ch34;
class Counter5{
    int count = 0;
    int count2 = 0;
    public void increment(){
        synchronized (Counter5.class){
            count++;
        }
    }
    public void decrement(){
        synchronized (Counter5.class){
            count--;
        }
    }
    public int getCount(){return count;}
}

public class MutualAccessSysncMethod {
    public static void main(String[] args) throws InterruptedException {
        Counter5 cnt = new Counter5();

        Runnable task1 = () -> {
            for(int i = 0; i< 1000; i++)
                cnt.increment();
        };

        Runnable task2 = () -> {
            for(int i = 0; i<1000; i++)
                cnt.decrement();
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(cnt.getCount());
    }
}
