package Java.ch11;
/*
    다음 주민등록 번호의 중간에 삽입된 - 를 지우고 공백으로 채워서 출력하는 프로그램을 작성해보자
    단 StringBuilder 클래스를 활용하여 빈번한 문자열의 생성이 발생하지 않도록 해야한다.
 */

public class ch11_02 {
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder("990925");
        stb.append(-1012);
        stb.append(999);
        System.out.println(stb.toString());

        stb.replace(6,7," ");
        System.out.println(stb.toString());
    }
}
/*
    정답 :
    public class RemoveBar2 {
	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("990925-1012999");
        sb.replace(6, 7, " ");
        System.out.println(sb.toString());
    }

}
 */