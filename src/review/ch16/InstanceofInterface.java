package review.ch16;
interface Printab{
    void printLine(String str);
}
class SimplePrint implements Printab{ //Printab를 직접 구현함
    public void printLine(String str){
        System.out.println(str);
    }
}

class MultiPrint extends SimplePrint{ //Printab 간적 구현함
    public void printLine(String str){
        super.printLine("start of multi...");
        super.printLine(str);
        super.printLine("end of multi");
    }
}

public class InstanceofInterface {
    public static void main(String[] args) {
        Printab prn1 = new SimplePrint();
        Printab prn2 = new MultiPrint();

        if(prn1 instanceof Printab)
            prn1.printLine("This is a simple printer.");
        System.out.println();

        if(prn2 instanceof Printab)
            prn2.printLine("This is a multiful printer.");
    }
}
