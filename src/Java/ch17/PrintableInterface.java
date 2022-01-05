package Java.ch17;
/*
    메소드의 몸체가 비어 있는 메소드를 가리켜 추상메소드라 한다. 그리고 이 인터페이스 대상으로는 인스턴스 생성이 불가 다른 클래스에 의해 상속이 될 뿐.
    클래스가 인터페이스를 상속하는 상속이 아닌 구현 특징 3가지가 있음
    1. 구현할 인터페이스를 명시할 때 키워드 implements를 사용한다.
    2. 한 클래스는 둘 이상의 인터페이스를 동시에 구현할 수 있다.
    3. 상속과 구현은 동시에 가능하다.
    인터페이스의 특징
    1. 인터페이스의 형을 대상으로 참조변수 선언이 가능하다.
    2. 인터페이스의 추상 메소드와 이를 구현하는 메소드 사이에 오버라이딩 관계가 성립한다.
 */

interface Printable{
    public void print(String doc);
}

class Printer implements Printable{ //Printable을 구현하는 Printer 클래스
    @Override
    public void print(String doc){
        System.out.println(doc);
    }
}

public class PrintableInterface {
    public static void main(String[] args) {
        Printable prn = new Printer();  //Printable형 참조변수 선언 가능
        prn.print("Hello Java");
    }

}
