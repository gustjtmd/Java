package Java.ch17;

interface Printable5{
    void print(String doc);
    default void printCMYK(String doc){}    //인터페이스의 디폴트 메소드
}

class Prn731Drv2 implements Printable5{
    @Override
    public void print(String doc){
        System.out.println("From MD-831 printer");
        System.out.println(doc);
    }
}

class Prn909Drv2 implements Printable5{
    @Override
    public void print(String doc){
        System.out.println("From MD-909 black& white");
        System.out.println(doc);
    }

    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }
}

public class PrinterDriver4 {
    public static void main(String[] args) {
        String myDoc = "This is report about...";
        Printable5 prn1 = new Prn731Drv2();
        prn1.print(myDoc);
        System.out.println();

        Printable5 prn2 = new Prn909Drv2();
        prn2.print(myDoc);
        prn2.printCMYK(myDoc);
    }
}
/*
    디폴틑 메소드의 특징은 다음과 같다
    - 자체로 완전한 메소드이다(비록 인터페이스 내에 정의되어 있지만)
    - 따라서 이를 구현하는 클래스가 오버라이딩 하지 않아도 된다.

    위의 예제
    1. 처음에는 Printable 인터페이스에 print 추상 메소드만 있었음.
    2. 이후에 필요에 따라 printCMYK 메소드를 추가함.
    3. 그래도 디폴트 메소드로 추가하엿으니 이전에 구현된 드라이버에는 영향을 주지않음.
 */