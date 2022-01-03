package Java.ch10;

class SimpleCalculator{
    static final double PI = 3.1415;

    double add(double n1, double n2){
        return n1 + n2;
    }
    double min(double n1, double n2){
        return n1 - n2;
    }
    double calCircleArea(double r){
        return PI * r * r;
    }
    double calCirclePeri(double r){
        return PI *(r * 2);
    }
}

public class UseCalculator {
    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
        System.out.println("3 + 4 = "+ sc.add(3,4));
        System.out.println("반지름 2.2 원의 넓이 : " +sc.calCircleArea(2.2) + "\n");

        System.out.println("15 - 7 = "+ sc.min(15,7));
        System.out.println("반지름 5.0, 원의 둘레 : "+ sc.calCirclePeri(5.0));
    }
}
/*
    위 예제에서 클래스에 정의된 메소드가 갖는 특징 두가지는 다음과 같음
    - 모두 외부에 기능을 제공하기 위한 메소드들이다.
    - 모두 인스턴스 변수의 값을 참조하거나 수저하지 않는다.
 */