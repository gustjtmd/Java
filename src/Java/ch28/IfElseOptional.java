package Java.ch28;

class ContInfo10{
    String phone;   //null일수 있음
    String adrs;    //null일수 있음

    public ContInfo10(String ph, String ad){
        phone = ph;
        adrs = ad;
    }
    public String getPhone(){return phone;}
    public String getAdrs(){return adrs;}
}
public class IfElseOptional {
    public static void main(String[] args) {
        ContInfo10 ci = new ContInfo10(null, "Republic of Korea");
        String phone;
        String addr;

        if(ci.phone != null)
            phone = ci.getPhone();
        else
            phone = "There is no phone number";

        if(ci.adrs != null)
            addr = ci.getAdrs();
        else
            addr = "There is no address.";

        System.out.println(phone);
        System.out.println(addr);
    }
}
