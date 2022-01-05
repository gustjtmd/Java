package Java.ch17;
/*
    인터페이스는 클래스에 특별한 표식을 다는 용도로도 사용이 된다. 그리고 이렇게 사용되는 인터페이스를 가리켜 마커 인터페이스라 한다
    마커 인터페이스에는 아무런 메소드도 존재하지 않는 경우가 많음
 */

import java.util.Locale;

interface Upper{}   //마커 인터페이스
interface Lower{}   //마커 인터페이스

interface Printable10{
    String getContents();
}

class Report implements Printable10, Upper{
    String cons;

    Report(String cons){
        this.cons = cons;
    }
    public String getContents(){
        return cons;
    }
}

class Printer10{
    public void printContents(Printable10 doc){
        if(doc instanceof Upper){   //doc 참조 인스턴스가 Upper 구현한다면
            System.out.println((doc.getContents().toUpperCase()));
        }
        else if(doc instanceof Lower){  //doc 참조 인스턴스가 Lower 구현한다면
            System.out.println((doc.getContents().toLowerCase()));
        }
        else
            System.out.println(doc.getContents());
    }
}

public class MakerInterface {
    public static void main(String[] args) {
        Printer10 prn = new Printer10();
        Report doc = new Report("Simple Funny News~");

        prn.printContents(doc);
    }
}
/*
    public String toUpperCase() 문자열의 모든 문자를 대문자로 바꾼다.
    public String toLowerCase() 문자열의 모든 문자를 소문자로 바꾼다.

    인터페이스 Upper와 Lower는 클래스에 붙이는 표식으로 사용되었다. Upper는 대문자로 출력하라는 표식이고 Lower는 소문자로 출력하라는 표식
    즉 두 인터페이스는 마커 인터페이스이다.
 */

/*
    추상클래스
 */