package Java.ch28;

import java.util.function.Function;

public class StringMaker {
    public static void main(String[] args) {
        Function<char[], String> f = String::new;
        /*
            Function<char[], String> f = (s) -> {
                return new String(s)
            };
         */
        char[] src = {'R','o','b','o','t'};
        String str = f.apply(src);
        System.out.println(str);
    }
}//Funciont<T,R>    R apply(T t);
