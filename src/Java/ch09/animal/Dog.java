package Java.ch09.animal;

import Java.ch09.Zoo.Cat;

// public : 어디서든 인스턴스 생성이 가능하다.
// default : 동일 패키지로 묶인 클래스 내에서만 인스턴스 생성을 허용한다.
public class Dog {
    public void makeCat(){
        // Cat은 public으로 선언되어있으므로 어디서든 인스턴스 생성 가능.
        Cat yaong = new Cat();
    }

    public void makeDuck(){
        //Duck은 default로 선언되어있으므로 이 위치에서 인스턴스 생성 불가
    //    Duck quack = new Duck(); - 컴파일 오류
    }
    public void welcom(Cat c){
        c.makeSound(); //호출 가능
//      c.makeHappy(); - 호출 불가 컴파일 오류.
    }
}
