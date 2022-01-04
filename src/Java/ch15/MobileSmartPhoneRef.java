package Java.ch15;

class MobilePhone2{
    protected String number;

    public MobilePhone2(String num){
        number = num;
    }
    public void answer(){
        System.out.println("Hi ~ from "+ number);
    }
}
class SmartPhone2 extends MobilePhone2{
    private String andriodVer;

    public SmartPhone2(String num, String ver){
        super(num);
        andriodVer = ver;
    }
    public void playApp(){
        System.out.println("App is running in "+ andriodVer);
    }
}

public class MobileSmartPhoneRef {
    public static void main(String[] args) {
        SmartPhone2 ph1 = new SmartPhone2("010-1111-1111","Nougat");
        MobilePhone2 ph2 = new SmartPhone2("010-9999-9999","Nougat");

        ph1.answer();
        ph1.playApp();
        System.out.println();

        ph2.answer();
   //   ph2.playApp(); playApp메소드가 없기때문에 호출불가.
    }
}
/*
    ph2는 MobilePhone형 참조변수이다. 이러한 경우는 MobilePhone 클래스에 정의 되어있거나 클래스가 상속하는 멤버로 제한된다.
    그 이유는
    1.실행 시간을 늦추는 결과로 이어질수 있기 떄문
    2.참조변수의 형을 기준으로 접근 가능한 멤버를 제한하는 것은 코드를 단순하게 한다.
 */