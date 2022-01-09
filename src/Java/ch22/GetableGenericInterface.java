package Java.ch22;

interface Getable<T>{
    public T get();
}
//인터페이스 Getable<T>를 구현하는 Box<T> 클래스

class Box20<T> implements Getable{
    private T ob;
    public void set(T o){ob = o;}

    @Override
    public T get(){
        return ob;
    }
}

class Toy20{
    @Override
    public String toString(){
        return "I am a Toy";
    }
}
public class GetableGenericInterface {
    public static void main(String[] args) {
        Box20<Toy20> box = new Box20<>();
        box.set(new Toy20());

        //Box<T>가 Getable<T>를 구현하므로 참조 가능
        Getable<Toy20> gt = box;
        System.out.println(gt.get());
    }
}
