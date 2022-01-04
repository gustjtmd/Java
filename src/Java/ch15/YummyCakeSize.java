package Java.ch15;
/*
    상위 클래스에 선언된 변수와 동일한 이름의 변수를 하위 클래스에서 선언하는 일은 가급적 피해야 한다.
    이는 코드에 혼란을 가져올 수 있기 때문. 그러나 문법적 측면에서 이렇게 변수를 선언했을때 어떻게 동작하는지 확인해보자.
 */

class Cake3{
    public int size;    //cake size

    public Cake3(int sz){
        size = sz;
    }
    public void showCakeSize(){
        System.out.println("Braed Ounces : "+ size);
    }
}
class CheeseCake3 extends Cake3{
    public int size;    //cheese size

    public CheeseCake3(int sz1, int sz2){
        super(sz1);
        size = sz2;
    }
    public void showCakeSize(){
        //super.size는 상위클래스의 멤버 size를 의미함.
        System.out.println("Bread Ounces: "+ super.size);

        //size이 클래스는 CheeseCake의 멤버 size를 의미함
        System.out.println("Cheese Ounces: "+ size);
    }
}
public class YummyCakeSize {
    public static void main(String[] args) {
        CheeseCake3 ca1 = new CheeseCake3(5,7);
        Cake3 ca2 = ca1;

        //ca2는 Cake형이므로 ca2.size는 Cake의 멤버 size를 의미함
        System.out.println("Bread Ounces:" + ca2.size);

        //ca1는 CheeseCake형이므로 ca1.size는 CheeseCake의 멤버 size를 의미함
        System.out.println("Cheese Ounces:" + ca1.size);
        System.out.println();

        ca1.showCakeSize();
        System.out.println();
        ca2.showCakeSize();
    }
}
