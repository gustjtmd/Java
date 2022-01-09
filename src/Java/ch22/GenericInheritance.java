package Java.ch22;

/*
    제네리 클래스 상속도 가능하다 이와 관련하여 예제를 보자.
 */

class Box<T>{
    protected T ob;
    public void set(T o ){ob = o;}
    public T get(){return ob;}
}

class SteelBox<T> extends Box<T>{
    public SteelBox(T o){   //제네릭 클래스의 생성자
        ob = o;
    }
}

public class GenericInheritance {
    public static void main(String[] args) {
        Box<Integer> iBox = new SteelBox<>(7959);
        Box<String> sBox = new SteelBox<>("Simple");
        System.out.println(iBox.get());
        System.out.println(sBox.get());
    }
}
