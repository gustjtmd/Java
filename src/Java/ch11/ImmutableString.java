package Java.ch11;
/*
    String str1 = new String("My String");
    String str2 = "Your String";
    두 방법으로 생성된 인스턴스 사이에는 어떠한 차이가 있는지 확인해보자
 */
public class ImmutableString {
    public static void main(String[] args) {
        String str1 = "Simple String";
        String str2 = "Simple String";

        String str3 = new String("Simple String");
        String str4 = new String("Simple String");

        if(str1 == str2)
            System.out.println("str1과 str2는 동일 인스턴스 참조");
        else
            System.out.println("str1과 str2는 다른 인스턴스 참조");

        if(str3 == str4)
            System.out.println("str3과 str4는 동일 인스턴스 참조");
        else
            System.out.println("str3과 str4는 다른 인스턴스 참조");
    }
}
/*
    결과 값이 다른데 이러한 차이를 보이는 이유는 무엇일까?
    - String 인스턴스는 Immutable 인스턴스입니다.
     세 사람이 있고 모두 동일한 채널을 시청하면서 채널을 절대 변경하지 않는다면(인스턴스를 참조만 하는 상황이라면)한대의 TV로
    모두가 시청을 할 수 있다 그러나 동일한 채널을 시청하다가 각 사람이 원할때 TV채널을 변경해야 한다면(인스턴스 안에 저장된 데이터를 변경해야 한다면)
    각 사람에게 한대씩 TV가 있어야 한다.

 */