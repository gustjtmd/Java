package Java.ch21;
/*
    제네릭 이전의 코드2
    Box인스턴스에서 내용물을 꺼낼때 형 변환을 해야한다.
    Box내에서 인스턴스를 저장하는 참조변수가 Object형이기 때문에 꺼낼대 알맞는 인스턴스로 형변환을 해줘야함.

 */

class Apple2{
    public String toString(){
        return "I am an apple.";
    }
}
class Orange2{
    public String toString(){
        return "I am an orange.";
    }
}
class Box2{
    private Object ob;
    public void set(Object o){
        ob = o;
    }
    public Object get(){
        return ob;
    }
}
public class FruitAndBox2 {
    public static void main(String[] args) {
        Box2 aBox = new Box2();
        Box2 oBox = new Box2();

        aBox.set(new Apple2());
        oBox.set(new Orange2());

        Apple2 ap = (Apple2)aBox.get();
        Orange2 og = (Orange2)oBox.get();

        System.out.println(ap);
        System.out.println(og);
    }
}
