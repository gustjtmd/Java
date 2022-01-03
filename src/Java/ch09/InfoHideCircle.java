package Java.ch09;

class Circle2 {
    private double rad = 0; //클래스 내부 접근만 허용
    final double PI = 3.14;

    public Circle2(double r) {
        setRad(r);
    }

    public void setRad(double r) {
        if (r < 0) {
            rad = 0;
            return;
        }
        rad = r;

    }
    public double getRad() {
        return rad;
    }

    public double getArea(){
        return (rad * rad) * PI; //원의 넓이 반환
    }

}


public class InfoHideCircle {
    public static void main(String[] args) {
        Circle2 c = new Circle2(1.5);
        System.out.println("반지름 : " +c.getRad());
        System.out.println("넓이 : " +c.getArea()+"\n");

        c.setRad(3.4);
        System.out.println("반지름 : " +c.getRad());
        System.out.println("넓이 : "+c.getArea());
    }
}
/*
    게터(Getter)
    - 인스턴스 변수의 값을 참조하는 용도로 정의된 메소드
    - 변수의 이름이 name일 때, 메소드의 이름은 getName으로 짓는 것이 관례

    세터(Setter)
    - 인스턴스 변수의 값을 설정하는 용도로 정의된 메소드
    - 변수의 이름이 name일 때 메소드의 이름은 setName으로 짓는 것이 관례

 */