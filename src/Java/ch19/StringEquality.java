package Java.ch19;

public class StringEquality {
    public static void main(String[] args) {
        String str1 = new String("So Simple");
        String str2 = new String("So Simple");

        //참조 대상을 비교하는 if~else문
        if(str1 == str2)
            System.out.println("str1, str2 참조 대상 동일하다");
        else
            System.out.println("str1, str2 참조 대상 다르다");

        //두 인스턴스 내용 비교하는 if~else문
        if(str1.equals(str2))
            System.out.println("str1, str2 내용 동일하다.");
        else
            System.out.println("str1, str2 내용 다르다.");
    }
}
/*
    두 인스턴스의 내용 비교를 원하다면 Object 클래스의 equals 메소드를 오버라이딩 하자
    참조 변수의 참조 값만 비교하려면 == 연산을 하자
 */