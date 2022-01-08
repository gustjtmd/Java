package Java.ch21;
/*
   Box<Apple> aBox = new Box<Apple>();
   - T를 Apple로 결정하여 인스턴스 생성
   - 따라서 Apple또는 Apple을 상속하는 하위 클래스의 인스턴스만 저장 가능
 */

class Apple4{
    public String toString(){
        return "i am apple";
    }
}
class Orange4{
    public String toString(){
        return "i am Orange";
    }
}

class Box4<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}
public class FruitAndBox2_Generic {
    public static void main(String[] args) {
        Box4<Apple4> aBox = new Box4<Apple4>(); //T를 Apple로 지정
        Box4<Orange4> oBox = new Box4<Orange4>(); //T를 Orange로 지정

        aBox.set(new Apple4()); //사과를 상자에 담는다.
        oBox.set(new Orange4()); //오렌지를 상자에 담는다.

        Apple4 ap = aBox.get(); //사과를 꺼내는데 형변환 하지 않는다.
        Orange4 og = oBox.get(); //오렌지를 꺼내는데 형변환 하지 않는다.
        System.out.println(ap);
        System.out.println(og);

    }
}
/*
    타입 매개변수 : Box<T>에서 T를 타입 매개변수라 한다.
    타입 인자 : Box<Apple>에서 Apple를 인자라고 한다.
    매개변수화 타입 : Box<Apple>
 */
