package Java.ch21;

class Box20<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}
class BoxFactory20{
    public static <T extends Number> Box20<T> makeBox(T o){
        Box20<T> box = new Box20<>();
        box.set(o);

        System.out.println("Boxed data : " + o.intValue());
        return box;
    }
}
class Unboxer20{
    public static <T extends Number> T openBox(Box20<T> box){
        System.out.println("Unboxced data : " + box.get().intValue());
        return box.get();
    }
}
public class BoundedGenericMethod {
    public static void main(String[] args) {

        Box20<Integer> sBox = BoxFactory20.makeBox(5959);
        int n = Unboxer20.openBox(new Box20<>());
        System.out.println("Returned data : "+ n);

    }
}
