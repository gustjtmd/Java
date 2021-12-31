package Java.ch06;
//정수 둘을 인자로 전달받아서 두 수의 사칙연산 결과를 출력하는 메소드와 이 메소드를 호출하는 main메소드를 정의해보자 단 나눗셈의 몫과 나머지를 각각
//출력해야 한다.
public class ch06_01 {
    public static void main(String[] args) {

        nanu(5,3);
    }

    public static void nanu(int x, int y){

        System.out.println("입력 받은 두 수의 값은 : " +x+","+y+" " +
                "두 수의 합은 : "+(x+y)+"두 수의 차는 : "+(x-y)+ "" +
                "두 수의 나머지 몫은 : " +x/y+ "두 수의 나머지는 : " +x%y);

    }
}
/*
정답 :
    {
        simpleOpr(7, 3);
    }

    public static void simpleOpr(int n1, int n2) {
        System.out.println("덧셈 결과: " + (n1 + n2));
        System.out.println("뺄셈 결과: " + (n1 - n2));
        System.out.println("곱셈 결과: " + (n1 * n2));
        System.out.println("나눗셈의 몫: " + (n1 / n2));
        System.out.println("나눗셈의 나머지: " + (n1 % n2));
    }

 */