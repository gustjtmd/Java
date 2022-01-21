package Java.ch34;

class Counter10{
    int count = 0;  //두 쓰레드에 의해 공유되는 변수

    public void increment(){
        count++;    //첫 번째 쓰레드에 의해 실행되는 문장
    }
    public void decrement(){
        count--;
    }
    public int getCount(){return count;}
}

public class MutualAccess {
    public static void main(String[] args) throws InterruptedException{
        Counter10 cnt = new Counter10();

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
