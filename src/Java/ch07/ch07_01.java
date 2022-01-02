package Java.ch07;

/*
   밑변과 높이 정보를 저장할 수 있는 Triangle 클래스를 정의하자(그 안에 적절한 생성자도 정의하자)
   그리고 밑변과 높이 정보를 변경할 수 있는 메소드의 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의하자
   물론 이 클래스의 활용의 예를 보이는 main 메소드도 함께 작성해야 한다.
 */
class Triangle{
    float base;
    float height;
    float area = 0;
    public Triangle(float bss,float hei){
        base = bss;
        height = hei;
    }
    public float newBase(float newBase){
        base = newBase;
        return base;
    }
    public float newHeight(float newHeight){
        height = newHeight;
        return height;
    }

    public void check(){
        System.out.println("밑변 : " +base);
        System.out.println("높이 : "+ height);
        System.out.println("총 넓이 :" + base*height/2);
    }
}

public class ch07_01 {
    public static void main(String[] args) {
        Triangle tri = new Triangle(5,5);
        tri.check();
        tri.newBase(30);
        tri.newHeight(100);
        tri.check();
    }
}
/*
정답 :
class Triangle {
    double bottom;
    double height;

    public Triangle(double bt, double hg) {
        bottom = bt;
        height = hg;
    }

    public void setBottom(double bt) {
        bottom = bt;
    }

    public void setHeight(double hg) {
        height = hg;
    }

    public double getArea() {
        return bottom * height / 2;
    }
}

class UseTriangle {
    public static void main(String[] args) {
        Triangle tr = new Triangle(10.2, 17.3);
        System.out.println("삼각형의 넓이: " + tr.getArea());

        tr.setBottom(7.5);
        tr.setHeight(9.2);
        System.out.println("삼각형의 넓이: " + tr.getArea());
    }
}


 */