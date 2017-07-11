/**
 * Created by malhotrs on 7/5/2017.
 */

class MainRectangle
{
    Point p2 = new Point(0, 6);
    Point p3 = new Point(8, 0);
    public Point getPoint()
    {
        Point p4 = new Point(p3.getX(), p2.getY());
        return p4;
    }
    class Point {
        int x ,y;
        Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
        public int getX()
        {
            return x;
        }
        public int getY()
        {
            return y;
        }
    }
}

public class Rectangle {
    public static void main(String[] args)
    {
        MainRectangle m = new MainRectangle();
        MainRectangle.Point p = m.new Point(0, 0);
        p = m.getPoint();
        System.out.println("Point : (" + p.getX() + ", " + p.getY() + ")");
        System.out.println("Length : " + p.getX());
        System.out.println("Width : " + p.getY());
    }
}
