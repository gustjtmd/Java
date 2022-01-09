package Java.ch22;
class Box10<T>{
    private T ob;
    public void set(T o){ob = o;}
    public T get(){return ob;}
}

class Toy10{
    @Override
    public String toString(){return "I am a Toy";}
}
class Robot10{
    @Override
    public String toString(){return "I am a Robot";}
}

class BoxHandler10{
    public static <T> void outBox(Box10<? extends T>box){
        T t = box.get();
        System.out.println(t);
    }
    public static <T> void inBox(Box10<? super T> box, T n){
        box.set(n);
    }
}
public class BoundedWildcardGenericMethod {
    public static void main(String[] args) {
        Box10<Toy> tBox = new Box10<>();
        BoxHandler10.inBox(tBox,new Toy());
        BoxHandler10.outBox(tBox);

        Box10<Robot10> rBox = new Box10<>();
        BoxHandler10.inBox(rBox,new Robot10());
        BoxHandler10.outBox(rBox);
    }
}
