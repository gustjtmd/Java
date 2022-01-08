package Java.ch21;

class Box11<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}
class Unboxer{
    public static<T> T openBox(Box11<T> box){
        return box.get();
    }
}
public class GenericMethodBoxMaker2 {
    public static void main(String[] args) {
        Box11<String> box = new Box11<>();
        box.set("My Generic Method");

        String str = Unboxer.openBox(box);
        System.out.println(str);
    }
}
