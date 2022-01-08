package Java.ch21;
/*
    보편적으로 자주 사용하는 타입 매개변수의 이름과 그 의미
    E : Element
    K : Key
    N : Number
    T : Type
    V : Value
    제네릭 클래스에 대하여 Box<Apple>과 같이 매개변수화 타입을 구성할때 기본 자료형의 타입은 타입 인자로 쓸 수 없다
    예 : Box<int>box = new Box<int> -> 컴파일 오류
 */

class Box<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}
public class PrimitivesAndGeneric {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<Integer>();
        iBox.set(30);       //오토박싱 진행
        int num = iBox.get();   //오토 언박싱 진행
        System.out.println(num);
    }
}
