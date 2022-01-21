package Java.ch34;

public class MakeThreadMultiDemo {
    public static void main(String[] args) {
        Runnable tast1 = () -> {
            try{
                for(int i = 0; i < 20; i++){    //20미만 짝수 출력
                    if(i % 2 == 0)
                        System.out.print(i+ " ");
                    Thread.sleep(100);  //0.1초 잠들기
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };
        Runnable tast2 = () -> {
            try {
                for(int i = 0; i < 20; i++){    //20미만 홀수 출력
                    if(i % 2 ==1)
                        System.out.print(i + " ");
                    Thread.sleep(100);  // 0.1초 잠들기
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(tast1);
        Thread t2 = new Thread(tast2);
        t1.start();
        t2.start();
    }
}
