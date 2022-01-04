package Java.ch11;

public class StringTest2 {
    public static void main(String[] args) {
        double e = 2.717171;
        String se = String.valueOf(e);
        System.out.println(se); //문자열 2.717171 출력

        System.out.println("funny" + "camp"); //컴파일러가 자동으로 "funny".concat("camp))해줌.
        String str = "age : " +17;
        System.out.println(str);
    //  String str2 = "age : ".concat(17);  concat메소드는 String인스턴스이 참조값을 인자로 요구하기 때문
        String str2 = "age : ".concat(String.valueOf(17));
        System.out.println(str2);
    }
}
