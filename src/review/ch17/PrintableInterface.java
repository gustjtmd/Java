package review.ch17;

interface Printable3{
    public void print(String doc);
}
class Printer implements Printable3 { //Printable을 구현하는 Printer 클래스
    @Override
    public void print(String doc){  //오버라이딩 관계 성립
        System.out.println(doc);
    }
}

public class PrintableInterface {
    public static void main(String[] args) {
        Printable3 prn = new Printer();  //Printable형 참조변수 선언 가능
        prn.print("Hello Java");
    }
}
