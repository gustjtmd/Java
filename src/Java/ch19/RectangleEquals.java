package Java.ch19;
class Point2 {
    private int xPos;
    private int yPos;

    public Point2(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public boolean equals(Object obj) {
        Point2 p = (Point2)obj;

        if(xPos == p.xPos && yPos == p.yPos)
            return true;
        else
            return false;
    }
}

class Rectangle2 {
    private Point upperLeft;    // 좌측 상단 좌표
    private Point lowerRight;    // 우측 하단 좌표

    public Rectangle2(int x1, int y1, int x2, int y2) {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }

    public boolean equals(Object obj) {
        Rectangle2 r = (Rectangle2)obj;

        if(upperLeft.equals(r.upperLeft) && lowerRight.equals(r.lowerRight))
            return true;
        else
            return false;
    }
}

class RectangleEquals {
    public static void main(String[] args) {
        Point2 p1 = new Point2(3, 4);
        Point2 p2 = new Point2(3, 4);

        Rectangle2 r1 = new Rectangle2(1, 2, 8, 9);
        Rectangle2 r2 = new Rectangle2(1, 2, 8, 9);

        if(p1.equals(p2))
            System.out.println("같다.");
        else
            System.out.println("다르다.");

        if(r1.equals(r2))
            System.out.println("같다.");
        else
            System.out.println("다르다.");
    }
}