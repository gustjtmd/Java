package Java.ch06;
//인자로 십진수 정수를 전달받아서 이에 해당하는 이진수 표현을 출력하는 메소드를 재귀의 형태로 정의하고
//이를 호출하는 main 메소드를 만들자
public class ch06_06 {
    public static void main(String[] args) {
        jinsu(5);
    }
    public static void jinsu(int x) {

        if(x == 0)
            return;
        jinsu(x/2);
        System.out.print(x%2);
    }
}

