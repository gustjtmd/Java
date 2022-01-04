package Java.ch11;
/*
    자바 7부터 String 인스턴스를 이용한 switch문의 구성이 가능해졌다. 즉 다음과 같이 switch문을 구성할수 있다.
 */
public class StringSwitch {
    public static void main(String[] args) {
        String str = "two";

        switch(str){
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            default:
                System.out.println("default");
        }
    }
}
