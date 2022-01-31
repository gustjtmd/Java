package review.ch17;

interface Printable10{
    void print(String doc);
}
interface ColorPrintable10 extends Printable10 { //Printable을 상속하는 인터페이스
    void printCMYK(String doc);
}

class Prn909Drv10 implements ColorPrintable10 {
    @Override
    public void print(String doc){  // 흑백 출력
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }
    @Override
    public void printCMYK(String doc){ //컬러 출력
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }
}

public class PrinterDriver3 {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";
        ColorPrintable10 prn = new Prn909Drv10();
        prn.print(myDoc);
        System.out.println();
        prn.printCMYK(myDoc);
    }
}
