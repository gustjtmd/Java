package Java.ch27;
@FunctionalInterface
interface Calculate50<T>{    //제네릭 기반의 함수형 인터페이스
    T cla(T a, T b);
}
public class LambdaGeneric {
    public static void main(String[] args) {
        Calculate50<Integer> ci = (a,b) -> a+b;
        System.out.println(ci.cla(3,4));

        Calculate50<Double> cd = (a,b) -> a+b;
        System.out.println(cd.cla(4.32,3.45));
    }
}
