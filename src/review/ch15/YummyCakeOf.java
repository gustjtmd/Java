package review.ch15;
class Cake10{}
class CheeseCake10 extends Cake10{}
class StraberryCheeseCake extends CheeseCake10{}


public class YummyCakeOf {
    public static void main(String[] args) {
        Cake10 cake = new StraberryCheeseCake();

        if(cake instanceof Cake10){
            System.out.println("참조변수 cake는 클래스 Cake를 상속합니다.");
        }
        if(cake instanceof CheeseCake10){
            System.out.println("참조변수 cake는 클래스 CheeseCake를 상속합니다");
        }
        if(cake instanceof StraberryCheeseCake){
            System.out.println("참조변수 cake는 클래스 StraberryCheeseCake를 상속합니다");
        }
    }
}
