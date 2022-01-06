package Java.ch18;
/*
    try {
           관찰영역
     }
    catech{
        처리영역
    }
 */


import java.util.Scanner;

public class ExceptionCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        try{
            System.out.println("a/b...a?");
            int n1 = kb.nextInt();
            System.out.println("a/b...b?");
            int n2 = kb.nextInt();
            System.out.printf("%d / %d = %d\n",n1,n2,n1/n2);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Good bye~");
    }
}
/*
    ArithmeticException 수학 연안에서의 오류 상황을 의미하는 예외 클래스
 */