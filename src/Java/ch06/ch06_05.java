package Java.ch06;
//인자로 정수 n을 전달받아서 2의 n승을 게산하여 반환하는 메소드를 재귀의 형태로 정의하고 이를 호출하는 main 메소드를 만들자
public class ch06_05 {
    public static void main(String[] args) {

        System.out.println(factorial(2));
        System.out.println(factorial(12));
    }

    public static int factorial(int n) {

        if(n==1)
            return 1;
        else
            return n * factorial(n-1);
    }
}