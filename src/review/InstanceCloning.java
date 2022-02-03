package review;

import java.awt.*;

class Point5 implements Cloneable{
    private int xPos;
    private int yPos;

    public Point5(int x, int y){
        xPos = x;
        yPos = y;
    }

    public void showPosition(){
        System.out.printf("[%d, %d]",xPos,yPos);
        System.out.println();
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class InstanceCloning {
    public static void main(String[] args) {
        Point5 org = new Point5(3,5);
        Point5 cpy;

        try{
            cpy = (Point5)org.clone();
            org.showPosition();
            cpy.showPosition();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
