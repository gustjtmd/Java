package Java.ch15;

class MobilePhone{
    protected String number;

    public MobilePhone(String num){
        number = num;
    }
    public void answer(){
        System.out.println("Hi ~ from " + number);
    }

}

class SmartPhone extends MobilePhone{
    private String androidVer;  //안드로이드 운영체제 네임(버전)

    public SmartPhone(String num, String ver){
        super(num);
        androidVer = ver;
    }
    public void playApp(){
        System.out.println("App is running is "+ androidVer);
    }
}

public class MobileSmartPhone {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("010-5555-5555","Nougat");
        phone.answer(); //전화를 받는다
        phone.playApp(); //앱을 선택하고 실행한다.
    }
}
