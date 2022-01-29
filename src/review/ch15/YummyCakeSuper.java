package review.ch15;
class Cake5{
    public void yummy(){
        System.out.println("Yummy Cake");
    }
}

class CheeseCake5 extends Cake5{
    public void yummy(){
        super.yummy();  //Cake의 yummy 메소드 호출
        System.out.println("Yummy Cheese Cake");
    }
    public void tasty(){
        super.yummy();  //Cake의 yummy 메소드 호출
        System.out.println("Yummy Tasty Cake");
    }
}
public class YummyCakeSuper {
    public static void main(String[] args) {
        CheeseCake5 cake = new CheeseCake5();
        cake.yummy();
        System.out.println();
        cake.tasty();
    }
}
