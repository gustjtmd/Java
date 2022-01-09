package Java.ch22;

class Box5<T>{
    private T ob;
    public void set(T o){ob = o;}
    public T get(){return ob;}

    @Override
    public String toString(){
        return ob.toString();
    }
}
class Unboxer5{
    public static void peekBox(Box5<? extends Number> box){
        System.out.println(box);
    }
}
public class UpperBoundedWildcard{
    public static void main(String[] args) {
        Box5<Integer> iBox = new Box5<>();
        iBox.set(1234);

        Box5<Double> dBox = new Box5<>();
        dBox.set(10.009);

        Unboxer5.peekBox(iBox);
        Unboxer5.peekBox(dBox);
    }
}
