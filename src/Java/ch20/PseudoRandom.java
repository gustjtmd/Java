package Java.ch20;

import java.util.Random;

public class PseudoRandom {
    public static void main(String[] args) {
        Random rand = new Random(12);
        for(int i=0;i<7;i++)
            System.out.println(rand.nextInt(1000));
    }
}
/*
    알고리즘이 시드값을 기반으로 돌아가기 때문에 이 값이 같으면 생성되는 난수의 패턴은 100% 일치한다.
 */