package Test;

class Box2<T>{
    private T ob;
    public void set(T o){ob = o;}
    public T get(){return ob;}
}
public class BoundedWildcardDemo {
    public static void addBox(Box2<? extends Integer> b1, Box2<? extends Integer> b2, Box2<? super Integer> b3){
            b3.set(b1.get()+b2.get());
    }
    public static void main(String[] args) {
        Box2<Integer> box1 = new Box2<>();
        box1.set(24);
        Box2<Integer> box2 = new Box2<>();
        box2.set(37);
        Box2<Integer> result = new Box2<>();
        result.set(0);
        addBox(box1,box2,result);
        System.out.println(result.get());
    }
}
