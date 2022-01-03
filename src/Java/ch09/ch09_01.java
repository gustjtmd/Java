package Java.ch09;
/*
    이 클래스를 기반으로 원을 의미하는 Circle 클래스를 정의하자 Circle클래스는 좌표상의 위치정보와 반지름의 길이 정보를 저장할 수 있어야 한다.
    그리고 다음 수준의 main메소드를 기반으로 Circle 클래스를 테스트하자.
 */

class Point{
    int xPos,yPos;
    public Point(int x, int y){
        xPos = x;
        yPos = y;

    }

    public void showPointInfo(){
        System.out.println("[" + xPos +"," +yPos + "]" );
    }
}
class Circle3{
    Point center;
    int rad;

    public Circle3(int x, int y, int r){
        center = new Point(x,y);
        rad = r;
    }
    public void showCircleInfo(){
        center.showPointInfo();
        System.out.println("Radios : " +rad);
    }
}
public class ch09_01 {
    public static void main(String[] args) {
        Circle3 c = new Circle3(2,2,4);
        c.showCircleInfo();
    }
}
