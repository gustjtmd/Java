package Java.ch21;

class Box10<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}
class BoxFactory{
    public static<T> Box10<T> makeBox(T o){   //제네릭 메소도의 정의.
        Box10<T> box = new Box10<T>();
        box.set(o); //전달된 인스턴스를 상자에 담아서
        return box; //이 상자에 반환한다.
    }
}
public class GenericMethodBoxMaker {
    public static void main(String[] args) {
        Box10<String> sBox = BoxFactory.makeBox("sweet");
        System.out.println(sBox.get());

        Box10<Double> dBox = BoxFactory.makeBox(7.59);
        System.out.println(dBox.get());
    }
}
