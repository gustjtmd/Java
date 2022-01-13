package Java.ch27;
interface HowLong{
    int len(String s);  //값을 반환하는 메소드
}
public class OneParamAndReturn {
    public static void main(String[] args) {
        HowLong hl = s -> s.length();
        System.out.println(hl.len("I am So Happy"));
    }
}
