package review.ch10;

import java.time.LocalDate;

class dateOf{
    static String date;

    static{
        LocalDate nDate = LocalDate.now();
        date = nDate.toString();
    }
}
public class DateOfExcution {
    public static void main(String[] args) {
        System.out.println(dateOf.date);
    }
}
