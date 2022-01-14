package Test;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<String,Integer> conv = (s,i) -> s.length()>i;

            if (conv.test("Robot",3))
                System.out.println("문자열 길이 3 초과");
            else
                System.out.println("문자열 길이 3 이하");
    }
}
