package Java.ch29;

import java.util.Arrays;
import java.util.List;

class Box<T>{
    private T ob;
    public Box(T o){ob = o;}
    public T get(){return ob;}
}
public class BoxToString {
    public static void main(String[] args) {
        List<Box<String>> ls = Arrays.asList(new Box<>("Robot"), new Box<>("Simple"));

          ls.stream().map(s->s.get()).forEach(s-> System.out.println(s));
          ls.stream().mapToInt(s->s.get().length()).forEach(System.out::println);
    }
}
