package Java.ch20;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력하세요");
        int x = sc.nextInt();
        System.out.println("두번째 정수를 입력하세요");
        int y = sc.nextInt();

        if(x>y){
            max = x;
            min = y;
        }
        else
            max = y;
            min = x;
        Random r = new Random();
        for(int i = 0; i<10; i++){
            int rn = min;
            rn += r.nextInt(max-min+1);
            System.out.println(rn);
        }
    }
}
