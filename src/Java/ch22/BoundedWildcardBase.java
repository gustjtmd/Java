package Java.ch22;

class Box7<T>{
    private T ob;
    public void set(T o){ob = o;}
    public T get(){return ob;}
}
class Toy{
    @Override
    public String toString(){
        return "I am Toy";
    }
}

class BoxHandler{
    public static void outBox(Box7<? extends Toy> box){
        Toy t = box.get();  //상자에서 꺼내기
        System.out.println(t);
     // box.set(new Toy()); 넣는것 에러
    }
    public static void inBox(Box7<? super Toy> box, Toy n){
        box.set(n);
    //  Toy myToy = box.get();  //꺼내는것 에러
    }
}
public class BoundedWildcardBase {
    public static void main(String[] args) {
        Box7<Toy> box = new Box7<>();
        BoxHandler.inBox(box,new Toy());
        BoxHandler.outBox(box);
    }
}
