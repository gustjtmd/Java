package Java.ch15;
/*
    상위 클래스에 정의된 메소드를 하위 클래스에서 다시 정의하는 행위를 메소드 오버라이딩이라 하는데
    여기서 말하는 오버라이딩은 무효화시키다의 뜻으로 해석이 된다.
 */

class Cake{
    public void yummy(){
        System.out.println("Yummy Cake");
    }
}
class CheeseCake extends Cake{
    public void yummy(){    //Cake의 Yummy 메소드를 오버라이딩함.
        System.out.println("Yummy Cheese Cake");
    }
}
public class YummyCakeOverriding {
    public static void main(String[] args) {
        Cake c1 = new CheeseCake();
        CheeseCake c2 = new CheeseCake();
        Cake c3 = new Cake();

        c1.yummy(); //오버라이딩 한 CheeseCake의 yummy메소드 호출됨
        c2.yummy(); //오버라이딩 한 CheeseCake의 yummy메소드 호출됨
        c3.yummy();
    }
}
/*
    메소드의 이름, 메소드의 반환형, 메소드의 매개변수 선언 이 세가지가 같아요 메소드 오버라이딩이 성립한다.
 */