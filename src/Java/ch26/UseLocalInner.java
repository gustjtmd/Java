package Java.ch26;

interface Printable10{
    void print();
}

class Papers10{
    private String con;
    public Papers10(String s){con = s;}

    public Printable10 getPrinter(){
        class Printer10 implements Printable10{ //로컬 클래스의 정의
            public void print(){
                System.out.println(con);
            }
        }
        return new Printer10();
    }
}
public class UseLocalInner {
    public static void main(String[] args) {
        Papers10 p = new Papers10("서류 내용 : 행복합니다.");
        Printable10 prn = p.getPrinter();
        prn.print();
    }
}
