package Java.ch30;

import java.util.stream.IntStream;

public class CreateIntStream {
    public static void showIntStream(IntStream is){
        is.forEach(n -> System.out.print(n + "\t"));
        System.out.println();

    }
    public static void main(String[] args) {
        IntStream.of(7, 5, 3).forEach(s -> System.out.print(s+"\t"));   //인자로 전달한 값을 스트림으로
        System.out.println();
        IntStream is4 = IntStream.range(5,8);   //숫자 5부터 8 이전까지 스트림으로
        showIntStream(is4);
    }
}
