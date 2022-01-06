package Java.ch18;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    try{
        1 ..
        2 예외 발생 지점
        3..
    } catch(Exception e){
    }
    4.예외 처리 이후 실행지점
 */
public class ExceptionCase2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        try {
            System.out.println("a/b...a?"); //입력 오류 발생 가능
            int n1 = kb.nextInt();
            System.out.println("a/b...b?"); //입력 오류 발생 가능
            int n2 = kb.nextInt();
        }catch (InputMismatchException e){
            e.getMessage();
        }
        System.out.println("Good bye~~~");
    }
}
/*
    InputMismatchException = 클래스 Scanner를 통한 값의 입력에서의 오류 상황을 의미하는 예외 클래스
 */