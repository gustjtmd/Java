package review.ch15;


class MobilePhone2{
    protected String number;    //전화번호

    public MobilePhone2(String num){
        number = num;
    }
    public void answer(){
        System.out.println("Hi~ from " +number);
    }
}

class SmartPhone2 extends MobilePhone2{
    private String androidVer;  //안드로이드 운영체제 네임

    public SmartPhone2(String num, String ver){
        super(num);
        androidVer = ver;
    }
    public void playApp(){
        System.out.println("App is running in "+androidVer);
    }
}


public class MobileSmartPhone {
    public static void main(String[] args) {
        SmartPhone2 phone = new SmartPhone2("010-555-555", "Nougat");
        phone.answer(); //전화를 받는다
        phone.playApp(); //앱을 선택하고 실행한다.
    }
}
