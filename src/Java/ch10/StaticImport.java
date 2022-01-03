package Java.ch10;
/*
    클래스 변수의 이름만으로 Math.PI에 접근하는 방법
 */
import static java.lang.Math.*;

public class StaticImport {
    public static void main(String[] args) {
        System.out.println(E);
        System.out.println(PI);

        System.out.println(abs(-55));   //절댓값 반환
        System.out.println(max(77,88)); //큰 값 반환
        System.out.println(min(33, 55));    //작은 값 반환
    }
}
