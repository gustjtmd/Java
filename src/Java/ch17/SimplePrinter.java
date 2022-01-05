package Java.ch17;

interface Printable6{
    static void printLine(String str){
        System.out.println(str);
    }
    default void print(String doc){
        printLine(doc);
    }
}

// 인터페이스 Printable에는 구현해야 할 메소드가 존재하지 않는다
class Printer2 implements Printable6{}

public class SimplePrinter {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";
        Printable6 prn = new Printer2();
        prn.print(myDoc);

        //인터페이스의 static 메소드 직접 호출
        Printable6.printLine("end of line");
    }
}
/*
    인터페이스에도 static 메소드를 정의 할 수 있다.
    그리고 인터페이스의 static 메소드 호출 방법은 클래스 static 메소드 호출 방법과 같다.
 */