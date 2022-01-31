package review.ch17;
interface Printable7{
    static void printLine(String str){
        System.out.println(str);
    }
    default void print(String doc){
        printLine(doc);
    }
}
//인터페이스 Printable에는 구현해야 할 메소드가 존재하지 않는다
class Printer7 implements Printable7{}
public class SimplePrinter {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";
        Printable7 prn = new Printer7();
        prn.print(myDoc);

        //인터페이스의 static 메소드 직접 호출
        Printable7.printLine("end of line");
    }
}
