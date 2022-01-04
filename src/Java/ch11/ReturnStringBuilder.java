package Java.ch11;
/*
    public StringBuilder append(int i);
    public StringBuilder delete(int start, int end)
    public StringBuilder insert(int offset, String str)
    무엇을 반환하는지 확인하기
 */

public class ReturnStringBuilder {
    public static void main(String[] args) {
        StringBuilder stb1 = new StringBuilder("123");
        StringBuilder stb2 = stb1.append(45678);

        System.out.println(stb1.toString());
        System.out.println(stb2.toString());

        //인덱스 0~4까지의 문자 삭제
        stb2.delete(0,5);

        System.out.println(stb1.toString());
        System.out.println(stb2.toString());

        //참조 값의 비교
        if(stb1 == stb2)
            System.out.println("같은 인스턴스 참조");
        else
            System.out.println("다른 인스턴스 참조");
    }
}
/*
    stb1과 stb2는 같은 인스턴스를 참조하게 됨 이러한 특성은 같은 메소드를 이어서 호출을 했을때 새로운 인스턴스를 생성하는 것이 아니라
    한 인스턴스의 메소드를 이어서 호출하는 결과를 갖게함.
    stb1.append(45).append(67).append(89);

    StringBuilder 클래스 이전에 사용이 되던 StringBuffer 클래스
    이 두 클래스는
    1. 생성자를 포함한 메소드의 수
    2. 메소드의 기능
    3. 메소드의 이름과 매개변수
    이 세가지가 일치하는것은 사실상 같은 클래스임을 의미한다 그러나 차이점이 존재
    StringBuffer는 쓰레드에 안전하지만 StringBuilder는 쓰레드에 안전하지 않음
    - 멀티 쓰레드에 안전하게 설계된 StringBuffer 클래스는 속도가 느리다
    즉 멀티 쓰레드와 상관없는 상황에서는 StringBuffer 클래스의 사용은 아쉬움을 남김
    크래서 상관없는 상황에서 사용될 목적으로 StringBuilder 클래스를 정의하기에 이름. 물론 멀티쓰레드에 안전하지 않지만 속도가 빠른 장점 존재
 */
