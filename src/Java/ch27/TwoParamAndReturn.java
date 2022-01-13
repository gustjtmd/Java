package Java.ch27;
interface Calculate2{
    int cal(int a, int b);   //값을 반환하는 추상 메소드
}
public class TwoParamAndReturn {
    public static void main(String[] args) {
        Calculate2 c;
        c = (a,b) -> {return a+b;};
        System.out.println(c.cal(4,3));

        c = (a,b) -> a + b;
        System.out.println(c.cal(4,3));
    }
}
