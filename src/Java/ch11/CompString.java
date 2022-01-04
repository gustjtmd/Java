package Java.ch11;
/*
    문자열의 내용 비교 : comparing
    두 문자열의 내용이 일치하면 0을 반환
    호출된 인스턴스의 문자열이 인저ㅏ로 전달된 문자열보다 앞서면 0보다 작은값 반환
    (str1.compareTo(str2)에서 str1의 문자열이 앞서는 경우
    호출된 인스턴스의 문자열이 인자로 전달된 문자열보다 뒤서면 0보다 큰 값 반환
    (반대)
    compareToIgnoreCase는 대소문자 구분하지 않음. 사전 편찬 순서상 대문자는 소문자 앞에 위치
 */
public class CompString {
    public static void main(String[] args) {
        String st1 = "Lexicographically";
        String st2 = "lexicographically";
        int cmp;

        if(st1.equals(st2))
            System.out.println("두 문자열은 같습니다.");
        else
            System.out.println("두 문자열은 다릅니다.");

        cmp = st1.compareTo(st2);

        if (cmp == 0)
            System.out.println("두 문자열은 일치합니다.");
        else if (cmp < 0 )
            System.out.println("사전적 앞에 위치하는 문자 : " + st1);
        else
            System.out.println("사전적 앞에 위치하는 문자 : " + st2);

        if (st1.compareToIgnoreCase(st2) == 0)
            System.out.println("두 문자열은 같습니다.");
        else
            System.out.println("두 문자열은 다릅니다.");
    }

}
