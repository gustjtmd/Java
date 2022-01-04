package Java.ch11;

class StringInst {
    public static void showString(String str){
        System.out.println(str);
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        String str1 = new String("Simple String");
        String str2 = "The Best String";

        System.out.println(str1);
        System.out.println(str1.length()); //length의 반환 값을 인자로 전달
        System.out.println();   //단순히 '개 행'이 이뤄진다.

        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println();

        showString("Funny String"); //String 인스턴스 생성 후에 메소드 호출

    }
}
/*
    메소드 length의 반환 값이 어떻게 println 메소드의 인자가 될 수 있을까?
    - 메소드 println은 다음과 같이 오버로딩 되어 있기 때문에 가능 특히 인자를 전달하지 않고도 호출이 가능한데 이럴경우 '개 행'을 하게됨
    void println(){..}
    void println(int x){..}
    void println(String x){..}
 */