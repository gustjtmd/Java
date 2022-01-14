package Test;

import java.util.function.BiConsumer;

class Box99<T>{
    private T ob;
    public void set(T o){ob = o;}
    public T get(){return ob;}
}
public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Box99<Integer>,Integer> b1 = (b,i) -> b.set(i);
        BiConsumer<Box99<Double>,Double> b2 = (b,d) -> b.set(d);

        Box99<Integer> bi = new Box99<Integer>();
        b1.accept(bi,30);
        System.out.println(bi.get());
    }
}
