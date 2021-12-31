package Java.ch06;
//정수 둘을 인자로 전달받아서 두 수의 차의 절대값을 계산하여 출력하는 메소드와 이 메소드를 호출하는 main 메소드를 정의해보자
//단 메소드 호출시 전달되는 값의 순서에 상관없이 절대값이 계산되고 출력되어야 한다.
public class ch06_02 {
    public static void main(String[] args) {

        nanu(5,3);
        nanu(10,20);
        nanu(-5,-10);
    }
    public static void nanu(int x, int y){
        if(x-y < 0){
            System.out.println("x 값 : "+x+ " y 값 : "+y+"절대값 : " +(y-x));
        }
        else
        System.out.println("x 값 : "+x+ " y 값 : "+y+"절대값 : " +(x-y));

    }
}
/*
정답 :
{
        abs(7, 3);
        abs(-5, -3);
        abs(4, -3);
    }

    public static void abs(int n1, int n2) {
        if(n1 > n2)
            System.out.println(n1 - n2);
        else
            System.out.println(n2 - n1);
    }
 */
