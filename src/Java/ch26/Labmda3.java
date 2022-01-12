package Java.ch26;
interface Printable100{ //추상 메소드가 하나인 인터페이스
    void print(String s);
}

public class Labmda3 {
    public static void main(String[] args) {
        Printable100 prn = (s) -> { System.out.println(s);};
        prn.print("What is Lambda?");
    }
}

