package Java.ch34;

public class ThreadMultiNoSleepDemo {
    public static void main(String[] args) {
        Runnable tast1 = () -> {
            for(int i = 0; i < 20; i++){    //20미만 짝수 출력
                if(i % 2 == 0)
                    System.out.print(i+ " ");
            }
        };
        Runnable tast2 = () -> {
            for(int i = 0; i < 20; i++){    //20미만 홀수 출력
                if(i % 2 ==1)
                    System.out.print(i + " ");
            }
        };

        Thread t1 = new Thread(tast1);
        Thread t2 = new Thread(tast2);
        t1.start();
        t2.start();
    }
}
