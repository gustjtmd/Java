package Java.ch11;
/*
    문자열 연결시키기 : Concatenating
    String 클래스의 concat 메소드를 이용하면 두 문자열을 연결시킨 문자열을 결과로 얻을 수 있다.
 */
public class StringConcat {
    public static void main(String[] args) {
        String str1 = "Coffee";
        String str2 = "Bread";

        String str3 = str1.concat(str2);
        System.out.println(str3);

        String str4 = "Fresh".concat(str3);
        System.out.println(str4);

    }
}
/*
    String str4 = "Fresh.concat(str3);
    큰 따옴표를 이용한 문자열의 표현은 String 인스턴스의 생성으로 이어지고 이 문자열의 위치에 생성된 인스턴스의 참조 값이 반환된다.
    따라서 위와 같은 형태의 문장 구성이 가능
 */
