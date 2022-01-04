package Java.ch11;
/*
    String 인스턴스가 지니는 문자열의 내용을 비교하기 위해서 equals 메소드를 사용해야 함.
 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("AtoZ");
        String str2 = new String("AtoZ");
        if(str1.equals(str2))   //문자열 내용이 같으면 equals 메소드는 true 반환
            System.out.println("두 문자열의 내용이 같습니다.");
        else
            System.out.println("두 문자열의 내용이 다릅니다.");
    }
}
