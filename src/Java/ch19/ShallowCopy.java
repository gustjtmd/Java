package Java.ch19;

class Point4 implements Cloneable{
    private int xPos;
    private int yPos;

    public Point4(int x, int y){
        xPos = x;
        yPos = y;
    }
    public void showPosition(){
        System.out.printf("[%d, %d]", xPos,yPos);
        System.out.println();
    }
    public void changePos(int x, int y){
        xPos = x;
        yPos = y;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

    class Rectangle4 implements Cloneable{
        private Point4 upperLeft;   //좌측 상단
        private Point4 lowerRight;  //우측 상단

        public Rectangle4(int x1, int y1, int x2, int y2){
            upperLeft = new Point4(x1, y1);
            lowerRight = new Point4(x2, y2);
        }
        public void changePos(int x1, int y1, int x2, int y2){
            upperLeft.changePos(x1, y1);
            lowerRight.changePos(x2, y2);
        }

        @Override
        public Object clone() throws CloneNotSupportedException{

            //Object 클래스의 clone 메소드 호출을 통한 복사본 생성
            Rectangle4 copy = (Rectangle4)super.clone();
            //깊은 복사의 형태로 복사본을 완성
            copy.upperLeft = (Point4)upperLeft.clone();
            copy.lowerRight = (Point4)upperLeft.clone();
            //완성된 복사본의 참조값 반환.
            return copy;
        }
        public void showPosition(){
            System.out.print("좌측 상단");
            upperLeft.showPosition();
            System.out.print("우측 상단");
            lowerRight.showPosition();
            System.out.println();
        }
    }

public class ShallowCopy {
    public static void main(String[] args) {
        Rectangle4 org = new Rectangle4(1,1,9,9);
        Rectangle4 cpy;

        try{
            cpy = (Rectangle4)org.clone();
            org.changePos(2,2,7,7);
            org.showPosition();
            cpy.showPosition();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
