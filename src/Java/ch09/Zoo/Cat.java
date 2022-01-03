package Java.ch09.Zoo;
// public : 어디서든 인스턴스 생성이 가능하다.
// default : 동일 패키지로 묶인 클래스 내에서만 인스턴스 생성을 허용한다.
class Duck{
    //빈 클래스
}

// Cat은 public으로 선언되었으므로 어디서든 인스턴스 생성 가능
public class Cat {

    // public 으로 선언된 메소드, 따라서 어디서든 호출 가능
    public void makeSound(){
        System.out.println("야옹");
    }

    //default로 선언된 메소드, 따라서 동일 패키지로 묶인 클래스 내에서 호출 가능.
    void makeHappy(){
        System.out.println("스마일~");
    }

    public void makeCat(){
        //Duck과 같은 패키지로 묶여있으니 Duck 인스턴스 생성 가능.
        Duck quack = new Duck();
    }
}
