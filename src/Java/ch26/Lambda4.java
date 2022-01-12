package Java.ch26;
interface Printable33{
    void print(String s);
}
public class Lambda4 {
    public static void ShowString(Printable33 p, String s){
        p.print(s);
    }
    public static void main(String[] args) {
        ShowString((s) -> {System.out.println(s);}, "Whiat is Lambda?");
    }
}
