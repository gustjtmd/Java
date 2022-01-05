package Java.ch17;

/*
    자바는 인터페이스 기반으로 개발된 클래스를 수정하지 않도록 인터페이스의ㅣ 상속을 지원함
 */

interface Printable4{
    void print(String doc);
}

interface ColorPrintable extends Printable4{
    void printCMYK(String doc);
}

//S사의 컬러 프린터 드라이버
class Prn909Drv implements ColorPrintable{
    @Override
    public void print(String doc){  //흑백 출력
        System.out.println("From MD-999 black white ver");
        System.out.println(doc);
    }
    @Override
    public void printCMYK(String doc){
        System.out.println("From MD-999 CMYK ver");
        System.out.println(doc);
    }
}

public class PrintDriver4 {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";
        ColorPrintable prn = new Prn909Drv();
        prn.print(myDoc);
        System.out.println();
        prn.printCMYK(myDoc);
    }
}
/*
    이로써 기존에 제작 및 배포가 되어 사용 중인 드라이버를 수정할 필요가 없게 되었다.
    또 인터페이스 사이에도 상속이 가능하고 이를 명시할때 extends를 사용함
    1. 두 클래스 사이의 상속은 extends로 명시한다.
    2. 두 인터페이스 사이의 상속도 extends로 명시한다.
    3. 인터페이스와 클래스 사이의 구현한 implements로 명시한다.
 */