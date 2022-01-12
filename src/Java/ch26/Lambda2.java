package Java.ch26;
interface Printable50{
    void print(String s);
}
public class Lambda2 {
    public static void main(String[] args) {
        Printable50 prn = new Printable50() {   //익명 클래스
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        };
        prn.print("What is Lambda?");
    }
}
