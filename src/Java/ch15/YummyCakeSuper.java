package Java.ch15;
/*
    클래스 외부가 아닌 내부에서 Cake의 Yummy 메소드를 호출하는 방법
 */

class Cake2{
    public void yummy(){
        System.out.println("Yummy Cake");
    }
}
class CheeseCake2 extends Cake2{
    public void yummy(){
        super.yummy();  //Cake의 yummy 메소드 호출
        System.out.println("Yummy Cheese Cake");
    }
    public void tasty(){
        super.yummy();  //Cake의 yummy메소드 호출
        System.out.println("Yummy Tast Cake");
    }
}
public class YummyCakeSuper {
    public static void main(String[] args) {
        CheeseCake2 cake = new CheeseCake2();
        cake.yummy();
        cake.tasty();
    }
}
/*
    상위 클래스에 정의된 오버라이딩 된 메소드의 호출을 목적으로도 super가 사용된다.
 */