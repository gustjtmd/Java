package Java.ch31;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        //Pc방의 PC 이용 시작 시간
        LocalTime start = LocalTime.of(14,24,35);
        System.out.println("Pc방 이용 시작 시각 : "+start);

        //Pc방의 PC 이용 종료 시각
        LocalTime end = LocalTime.of(17,31,19);
        System.out.println("Pc 이용 종료 시각 : "+end);

        //Pc이용 시간 계산
        Duration between = Duration.between(start,end);
        System.out.println("총 Pc 이용 시간 : "+between);
    }
}
