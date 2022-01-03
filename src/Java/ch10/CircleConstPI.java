package Java.ch10;
/*
    인스턴스 간에 데이터 공유가 필요한 상황에서 클래스 변수를 선언한다.
 */

class Circle{
    static final double PI = 3.1415;    //변하지 않는 참조가 목적인 값
    private double radios;

    Circle(double rad){
        radios = rad;
    }
    void showPerimeter(){
        double peri = (radios * 2) * PI;
        System.out.println("둘레 : " +peri);
    }
    void showArea(){
        double area = (radios * radios) * PI;
        System.out.println("넓이 : " + area);
    }
}

public class CircleConstPI {
    public static void main(String[] args) {
        Circle c = new Circle(1.2);
        c.showPerimeter();
        c.showArea();
    }
}
/*
    PI가 지닌값인 원주율은 결코 변하지 않는 값임
    인스턴스 변수가 아닌 클래스 변수로 선언이 되었는데 이는 모든 Circle 인스턴스가 참조해야 하는 값이지만
    인스턴스가 가각 지녀야 하는 값은 아니기 때문

    - 참졸르 목적으로 존재하는 값은 final 선언이 된 클래스 변수에 담는다.
 */
