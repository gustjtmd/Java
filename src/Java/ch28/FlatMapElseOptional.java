package Java.ch28;

import javax.swing.text.html.Option;
import java.util.Optional;

class ContInfo9{
    Optional<String> phone; //null일수 있음.
    Optional<String> adrs;  //null일수 있음.

    public ContInfo9(Optional<String> ph, Optional<String> ad){
        phone = ph;
        adrs = ad;
    }
    public Optional<String> getPhone() {return phone;}
    public Optional<String> getAdrs(){return adrs;}
}
public class FlatMapElseOptional {
    public static void main(String[] args) {
        Optional<ContInfo9> ci = Optional.of
                (new ContInfo9(Optional.ofNullable(null),Optional.of("Republic of Korea")));

        String phone = ci.flatMap(ContInfo9::getPhone).orElse("There is no phone number.");
        String addr = ci.flatMap(c -> c.getAdrs()).orElse("There is no address.");
        System.out.println(phone);
        System.out.println(addr);
    }
}
