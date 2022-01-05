package Java.ch17;

interface Printable7{
    void printLine(String str);
}

class SimplePrinter2 implements Printable7{
    public void printLine(String str){
        System.out.println(str);
    }
}

class MultiPrinter extends SimplePrinter2{  //Printable을 간접 구현함
    public void printLine(String str){
        super.printLine("start of multi...");
        super.printLine(str);
        super.printLine("end of multi");
    }
}

public class InstaceofInteraface {
    public static void main(String[] args) {
        Printable7 prn1 = new SimplePrinter2();
        Printable7 prn2 = new MultiPrinter();

        if(prn1 instanceof Printable7){
            prn1.printLine("This is simple printer.");
        }
        System.out.println();
        if(prn2 instanceof Printable7){
            prn2.printLine("this is a multiful printer");
        }
    }
}
/*
    SimplePrinter는 Printable를 직접 MultiPrinter는 Printable 인터페이스를 간접 구현하기 때문에 true
 */