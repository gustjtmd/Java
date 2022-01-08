package Java.ch21;
/*
    제네릭 클래스의 타입 인자를 제한하기.
    class Box<T extends Number>{...}
    - 인스턴스 생성시 타입 인자로 Number 또는 이를 상속하는 클래스만 올 수 있음.
 */
class Box6<T extends Number>{
    private T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}
public class BoundedBox {
    public static void main(String[] args) {
        Box6<Integer> iBox = new Box6<>();  //Integer는 Number를 상속
        iBox.set(24);

        Box6<Double> dBox = new Box6<>();   //Double은 Number를 상속
        dBox.set(5.97);

        System.out.println(iBox.get());
        System.out.println(dBox.get());
    }

}
