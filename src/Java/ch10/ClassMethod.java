package Java.ch10;
/*
    클래스 메소드의(static 메소드의) 정의와 호출
    - 인스턴스 생성 이전부터 접근이 가능
    - 어느 인스턴스에도 속하지 않는다
 */

class NumberPrinter{
    private int myNum = 0;

    static void showInt(int n){ //클래스 메소드(static 메소드)
        System.out.println(n);
    }
    static void showDouble(double n){ //클래스 메소드
        System.out.println(n);
    }
    void setMynumber(int n){ //인스턴스 메소드
        myNum = n;
    }
    void showMyNumber(){//인스턴스 메소드
        showInt(myNum); //클래스 내부에서 클래스 메소드 호출
    }
}
public class ClassMethod {
    public static void main(String[] args) {
        NumberPrinter.showInt(20);

        NumberPrinter np = new NumberPrinter();
        np.showDouble(3.15);    //인스턴스 이름을 통한 클래스 메소드 호출
        np.setMynumber(75);
        np.showMyNumber();
    }
}
