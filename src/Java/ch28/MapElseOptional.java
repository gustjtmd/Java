package Java.ch28;

import java.util.Optional;

class ContInfo3{
    String phone;   //null일수 있음.
    String adrs;    //null일수 있음.

    public ContInfo3(String ph, String ad){
        phone = ph;
        adrs = ad;
    }
    public String getPhone(){return phone;}
    public String getadrs(){return adrs;}
}

public class MapElseOptional {
    public static void main(String[] args) {
        Optional<ContInfo3> ci = Optional.of(new ContInfo3(null,"Republic of Korea"));

        String phone = ci.map(c -> c.getPhone())
                        .orElse("There is no phone number.");
        String addr = ci.map(c -> c.getadrs())
                        .orElse("There is no address.");

        System.out.println(phone);
        System.out.println(addr);
    }
}
