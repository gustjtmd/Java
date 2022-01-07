package Java.ch19;

class Point3 implements Cloneable {
    private int xPos;
    private int yPos;

    public Point3(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void showPosition() {
        System.out.printf("[%d, %d]", xPos, yPos);
        System.out.println();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class InstanceCloning {
    public static void main(String[] args) {
        Point3 org = new Point3(3,5);
        Point3 cpy;

        try {
            cpy = (Point3)org.clone();  //Object형으로 반환하기 떄문에 형변환 해줘야함
            org.showPosition();
            cpy.showPosition();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
