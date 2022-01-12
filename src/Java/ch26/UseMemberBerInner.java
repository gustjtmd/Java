package Java.ch26;
interface Printable5{
    void print5();
}
class Papers5{
    private String con;
    public Papers5(String s){
        con = s;
    }
    public Printable5 getPrinter(){
        return new Printer5();
    }
    private class Printer5 implements Printable5{   //멤버 클래스의 정의
        public void print5(){
            System.out.println(con);
        }
    }
}
public class UseMemberBerInner {
    public static void main(String[] args) {
        Papers5 p = new Papers5("서류 내용 : 행복합니다.");
        Printable5 prn = p.getPrinter();
        prn.print5();
    }
}
