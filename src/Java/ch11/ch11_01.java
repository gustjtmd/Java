package Java.ch11;
/*
    다음 주민등록 번호의 중간에 삽입된 - 를 지우고 공백으로 채워서 출력하는 프로그램을 작성하자
 */
public class ch11_01 {
    public static void main(String[] args) {
        String str = "990925-1012999";
        System.out.println(str.substring(0,6));
    }
}
/*
정답 :
class RemoveBar {
    public static void main(String[] args) {
        String s1 = "990925-1012999";
        String s2 = s1.substring(0, 6) + ' ' + s1.substring(7);
        System.out.println(s2);
    }
}
 */