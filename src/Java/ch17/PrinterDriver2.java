package Java.ch17;
/*
    인터페이스의 모든 메소드는 public 선언 된 것으로 간주한다
    인터페이스의 변수 특징
    1.반드시 선언과 동시에 값으로 초기화 해야한다.
    2.모든 변수는 public static final이 선언된 것으로 간주한다
 */
interface Printable3{   //MS가 정의하고 제공한 인터페이스
    public void print(String doc);
}

class Prn204Drv implements Printable3{ //S회사가 정의한 클래스
    @Override
    public void print(String doc){
        System.out.println("From MD-204 printer");
        System.out.println(doc);
    }
}
class Prn731Drv implements Printable3{
    @Override
    public void print(String doc){
        System.out.println("From MD-731 printer");
        System.out.println(doc);
    }
}
public class PrinterDriver2 {
    public static void main(String[] args) {
        String myDoc = "This is report aboud...";


        Printable3 prn  =new Prn204Drv();
        prn.print(myDoc);
        System.out.println();

        //LG 프린터로 출력
        prn = new Prn731Drv();
        prn.print(myDoc);

    }
}


