package Java.ch17;
/*
    인터페이스의 본질적 의미
    인터페이스의 사전적 의미는 연결점 또는 접점으로 둘 사이를 연결하는 매개체를 뜻함 실제로 자바의 인터페이스는 그런 역할을 함
    가정
    인터페이스를 하나 만들어서 모든 프린터 업체에게 제공해야 겠다.
    이 인터페이스를 회사별로 각자 구현해서 가져와 우리는 print메소드를 호출하면서 정보를 인자로 전달할게
 */
interface Printable2{   //MS가 정의하고 제공한 인터페이스
    public void print(String doc);
}

class SPrinterDriver implements Printable2{ //S회사가 정의한 클래스
    @Override
    public void print(String doc){
        System.out.println("From Samsung printer");
        System.out.println(doc);
    }
}
class LPrinterDriver implements Printable2{
    @Override
    public void print(String doc){
        System.out.println("From LG printer");
        System.out.println(doc);
    }
}
public class PrinterDriver {
    public static void main(String[] args) {
        String myDoc = "This is report aboud...";

        //삼성 프린터로 출력
        Printable2 prn  =new SPrinterDriver();
        prn.print(myDoc);
        System.out.println();

        //LG 프린터로 출력
        prn = new LPrinterDriver();
        prn.print(myDoc);

    }
}
