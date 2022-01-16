package Java.ch29;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringStream {
    public static void main(String[] args) {
        String[] names = {"Seo", "Seoung", "Hyun"};
        Stream<String> stm = Arrays.stream(names);  //스트림 생성
        stm.forEach(s -> System.out.println(s));
    }
}
