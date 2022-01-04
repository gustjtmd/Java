package Java.ch12;

import java.util.Scanner;

//Scanner 인스턴스를 키보드와 연결하기 Scanner sc = new Scanner(System.in);
//Scanner의 생성자로 전달된 System.in은 키보드를 의미한다 정확히는 키보드를 의미하는 인스턴스의 참조변수
public class ScanningKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        System.out.printf("%d + %d + %d = %d \n",num1,num2,num3,sum);

    }
}
