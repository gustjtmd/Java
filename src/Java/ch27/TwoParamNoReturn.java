package Java.ch27;
interface Calculate5{
    void cal(int a, int b); //매개변수 둘, 반황형 void
}
public class TwoParamNoReturn {
    public static void main(String[] args) {
        Calculate5 c;
        c = (a,b) -> System.out.println(a+b);
        c.cal(4,3); //이번에 덧셈이 진행

        c = (a,b) -> System.out.println(a-b);
        c.cal(4,3); //이번엔 뺄셈이 진행

        c = (a,b) -> System.out.println(a * b);
        c.cal(4,3); //이번엔 곱셈이 진행.
    }
}
