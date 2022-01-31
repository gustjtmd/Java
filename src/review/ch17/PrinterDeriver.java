package review.ch17;

interface Printable5{    //MS가 정의하고 제공하는 인터페이스
    public void print(String doc);
}
class SprinterDriver5 implements Printable5 {  // S사가 정의한 클래스
    @Override
    public void print(String doc){
        System.out.println("From Samsung printer");
        System.out.println(doc);
    }
}
class LPrinterDriver5 implements Printable5{
    @Override
    public void print(String doc){
        System.out.println("From LG printer");
        System.out.println(doc);
    }
}

public class PrinterDeriver {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        //삼성 프린터로 출력
        Printable5 prn = new SprinterDriver5();
        prn.print(myDoc);
        System.out.println();

        //LG 프린터로 출력
        prn = new LPrinterDriver5();
        prn.print(myDoc);
    }
}
