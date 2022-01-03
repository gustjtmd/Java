package Java.ch10;

class Car{
    void myCar(){
        System.out.println("This is my car");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.myCar();
        Boat t = new Boat();
        t.myBoat();
    }
}
class Boat{
    void myBoat(){
        System.out.println("This is my boat");
    }
}
/*
    Car클래스와 static으로 선언된 main 메소드는 사실상 별개이다.
    다만 Car 클래스가 main 메소드에게 공간을 제공했을 뿐이다.
 */

