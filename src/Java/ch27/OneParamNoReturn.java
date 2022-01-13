package Java.ch27;
interface Pritable{
    void print(String s);   //매개변수가 하나, 반황형 void
}
public class OneParamNoReturn {
    public static void main(String[] args) {
        Pritable p;
        p = (String s) -> {System.out.println(s);};  //줄임 없는 표현
        p.print("Lambda exp one.");

        p = (String s) -> System.out.println(s);     //중괄호 생략
        p.print("Lambda exp two");

        p = (s) -> System.out.println(s);   // 매개변수 형 생략
        p.print("Lambda exp three");

        p = s -> System.out.println(s);     // 매개변수 소괄호 생략
        p.print("Lambda exp four");
    }
}
