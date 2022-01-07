package Java.ch20;

import java.util.Random;

/*
    난수의 생성
 */
public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();//실행할때마다 다른 결과를 보인다
        for(int i=0; i<7; i++)
            System.out.println(rand.nextInt(1000)); //0이상 1000미만 난수 생성
    }
}
