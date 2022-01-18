package Java.ch31;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo2 {
    public static void main(String[] args) {

        //한국 출발 2017-12-09 14:30
        ZonedDateTime start = ZonedDateTime.of(
                LocalDateTime.of(2017,12,9,14,30), ZoneId.of("Asia/Seoul"));
        System.out.println("start : "+start);

        //파리 도착 2017-12-09 17:25
        ZonedDateTime arrival = ZonedDateTime.of(
                LocalDateTime.of(2017,12,9,17,25),ZoneId.of("Europe/Paris"));
        System.out.println("Arrival : "+arrival);

        //비행시간
        System.out.println(Duration.between(start,arrival));
    }
}
