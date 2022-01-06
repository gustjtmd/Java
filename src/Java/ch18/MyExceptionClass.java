package Java.ch18;
/*
    프로그래머가 직접 예외 클래스를 정의하고 이를 기반으로 특정 상황에서 예외가 발생하도록 할 수 있다.

    class ReadException extends Exception{  Exception을 상속하는 것이 핵심
        public ReadAgeException(){
            super("유효하지 않은 나이가 입력됨")
        }
    }
 */

import java.util.Scanner;

class ReadAgeException extends Exception{
    public ReadAgeException(){
        super("유효하지 않은 나이가 입력되었습니다.");
    }
}
public class MyExceptionClass {
    public static void main(String[] args) {
        System.out.println("나이 입력 :");

        try{
            int age = readAge();
            System.out.printf("입력된 나이 %d\n",age);
        }
        catch (ReadAgeException e){
            System.out.println(e.getMessage());
        }
    }

    public static int readAge() throws ReadAgeException{
        Scanner kb = new Scanner(System.in);
        int age = kb.nextInt();

        if(age < 0)
            throw new ReadAgeException();   //예외의 발생

        return age;
    }
}
