package Java.ch05;
//while문을 for문으로 바꿔보자
public class ch05_08 {
    public static void main(String[] args) {
        int num;
        int count = 0;

        for(num=1;num<100;num++){
            if(((num % 5) == 0) && (num % 7) == 0){
                count++;
                System.out.println(num);
            }
        }
        System.out.println("count : " +count);
    }
}
/*
정답
        int count = 0;

        for(int num = 1; num <= 100; num++) {
            if((num % 5) != 0 || (num % 7) != 0)
                continue;
            count++;
            System.out.println(num);
        }
        System.out.println("count: " + count);
 */
