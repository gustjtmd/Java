package Java.ch20;
/*
    프로그램 사용자로부터 정수 A와 Z를 입력받아 A부터 Z를 포함하여 그 사이에 있는 난수 10개를 출력하자
 */

import java.util.Random;
import java.util.Scanner;

public class ch20_1 {
    public static void main(String[] args) {
        int x;
        int y;
        int max = 0;
        int min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력하세요");
        x = sc.nextInt();
        System.out.println("두번째 정수를 입력하세요");
        y = sc.nextInt();
        if(x>y){
            max = x;
            min = y;
        }
        else{
            max = y;
            min = x;
        }
        Random rnd = new Random();
        for (int i =0; i<10; i++){
            int um = min;
            um += rnd.nextInt((max-min)+1);
            System.out.println(um);
        }
    }
}
