package Java.ch10;

class SC{
    static final double PI = 3.1415;

    static double add(double n1, double n2){
        return n1+n2;
    }
    static double min(double n1, double n2){
        return n1-n2;
    }
    static double calCircleArea(double r){
        return PI * r * r;
    }
    static double calCirclePeri(double r){
        return PI * (r*2);
    }
}
public class UseCalculatorCMVer {
    public static void main(String[] args) {
        System.out.println("3 + 4 =" +SC.add(3,4));
        System.out.println("반지름 2.2, 원의 넓이 : " +SC.calCircleArea(2.2)+"\n");

        System.out.println("15 - 7 = "+SC.min(15,7));
        System.out.println("반지름 5.0 원의 둘레 : "+SC.calCirclePeri(5.0));

    }
}
/*
    메소드에 static 선언을 추가함으로 인해 불필요한 인스턴스의 생성 과정을 생략할 수 있게 되었다.
    실제로 클래스 메소드로 구성된 인스턴스의 생성을 목적으로 설계되지 않은 클래스들도 존재하고
    프로그래머가 이러한 유형의 클래스를 직접 설계하는 경우도 있음
 */