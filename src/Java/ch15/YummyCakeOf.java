package Java.ch15;
/*
    if(ca instanceof Cake)
    ca는 참조변수이고 Cake는 클래스 이름이다 그리고 ca가 참조하는 인스턴스가 Cake의 인스턴스이거나 Cake를 상속하는 클래스의 인스턴스이면
    true를 그렇지 않으면 false를 반환한다.
 */

class Cake4{
}
class CheeseCake4 extends Cake4{
}
class StrawberryCheeseCake extends CheeseCake4{
}
public class YummyCakeOf {
    public static void main(String[] args) {
        Cake4 cake = new StrawberryCheeseCake();
        if(cake instanceof Cake4){
            System.out.println("케이크 인스턴스 or");
            System.out.println("케이크 상속하는 인스턴스 \n");
        }
        if (cake instanceof CheeseCake4){
            System.out.println("치즈케이크 인스턴스or");
            System.out.println("치즈케이크 상속하는 인스턴스\n");
        }
        if (cake instanceof StrawberryCheeseCake){
            System.out.println("딸기치즈케이크 인스턴스 or");
            System.out.println("딸기치즈케이크 상속하는 인스턴스.");
        }
    }
}
