package Java.ch21;
/*
   이런 실수도 발생할수 있다.
   프로그래머의 실수가 컴파일 과정에서 발견되지 않는다.
 */
class Apple3{
    public String toString(){
        return "I am Apple";
    }
}
class Orange3{
    public String toString(){
        return "I am Orange";
    }
}
class Box3{
    private Object og;

    public void set(Object o){
        og = o;
    }
    public Object get(){
        return og;
    }
}
public class FruitAndoxFault {
    public static void main(String[] args) {
        Box3 aBox = new Box3();
        Box3 bBox = new Box3();

        //아래 두 문장에서 사과와 오렌지가 아닌 문자열을 담았다.
        aBox.set("Apple");
        bBox.set("Orenge");

        //상자에 과일이 담기지 않았는데 과일을 꺼내려한다.
        Apple3 ap = (Apple3)aBox.get();
        Orange3 o = (Orange3)bBox.get();

        System.out.println(ap);
        System.out.println(o);

    }
}
