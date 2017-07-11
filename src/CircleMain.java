/**
 * Created by malhotrs on 7/5/2017.
 */
class Circle {
    float rad;
    Circle(float r) {
        this.rad = r;
    }
    public float area() {
        return ((22/7) * rad *rad);
    }
    public float perimeter() {
        return (2 * (22/7) * rad);
    }
}
public class CircleMain {
    public static void main(String[] args) {
            Circle c = new Circle(5.6f);
            System.out.println("Area : " + c.area());
            System.out.println("Perimeter : " + c.perimeter());
        }
}
