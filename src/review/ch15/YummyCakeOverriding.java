package review.ch15;
class Cake3{
    public void yummy(){
        System.out.println("Yummy Cake");
    }
}
class CheeseCake3 extends Cake3{
    public void yummy(){    //Cake의 yummy 메소드를 오버라이딩함
        System.out.println("Yummy Cheese Cake");
    }
}
public class YummyCakeOverriding {
    public static void main(String[] args) {
        Cake3 c1 = new CheeseCake3();
        CheeseCake3 c2 = new CheeseCake3();

        c1.yummy(); //오버라이딩한 CheeseCake의 yummy 메소드 호출됨
        c2.yummy(); //오버라이딩한 CheeseCake의 yummy 메소드 호출됨

        System.out.println();
        Cake3 c3 = new Cake3();
        c3.yummy(); //Cake의 yummy 메소드 호출됨.
    }
}
