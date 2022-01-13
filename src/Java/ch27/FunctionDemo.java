package Java.ch27;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("Robot"));
        System.out.println(f.apply("System"));
    }
}
