package Java.ch21;

interface Eatable{
    public String eat();
}

class Apple5 implements Eatable{
    public String toString(){
        return "I am apple.";
    }
    @Override
    public String eat(){
        return "It tastes so good!";
    }
}
class Box7<T extends Eatable>{  //Eatable를 구현하는 클래스로만 타입 인자 제한.
    T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        System.out.println(ob.eat());   //Eatable로 제한하였기에 eat 호출 가능
        return ob;
    }
}
public class BoundedInterfaceBox {
    public static void main(String[] args) {
        Box7<Apple5> box = new Box7<>();
        box.set(new Apple5());  //사과 저장

        Apple5 ap = box.get();  //사과 꺼내기
        System.out.println(ap);
    }
}
/*
    하나의 클래스아ㅗ 하나 이상의 인터페이스에 대해 동시에 제한을 할 수 있음.
    class Box<T extends Number & Eatable>{...}  이 경우 Number를 상속하면서 동시에 Eatable 인터페이스를 구현하는
    클래스만이 타입 인자로 올 수 있음.
 */
