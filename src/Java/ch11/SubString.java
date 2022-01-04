package Java.ch11;
/*
    문자열의 일부를 추출하기 : Substring
 */

public class SubString {
    public static void main(String[] args) {
        String st1 = "abcdefg";
        String st2 = st1.substring(2);
        System.out.println(st2);

        String st3 = st1.substring(2,4);
        System.out.println(st3);
    }
}
