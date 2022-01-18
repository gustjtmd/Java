package Java.ch31;

import java.time.ZoneId;

public class ZoneidDemo {
    public static void main(String[] args) {
        ZoneId paris = ZoneId.of("Europe/Paris");
        System.out.println(paris);
    }
}
