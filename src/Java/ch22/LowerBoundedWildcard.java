package Java.ch22;

class Box6<T>{
    private T ob;
    public void set(T o){ob = o;}
    public T get(){return ob;}

    public String toString(){return ob.toString();}
}

class Unboxer6{
    public static void peekBox(Box6<? super Integer> box){
        System.out.println(box);
    }
}
public class LowerBoundedWildcard {
    public static void main(String[] args) {
        Box6<Integer> iBox = new Box6<>();
        iBox.set(5577);

        Box6<Number> nBox = new Box6<>();
        nBox.set(new Integer(9955));

        Box6<Object> oBox = new Box6<>();
        oBox.set("My Simple Instance");

        Unboxer6.peekBox(iBox);
        Unboxer6.peekBox(nBox);
        Unboxer6.peekBox(oBox);
    }
}
