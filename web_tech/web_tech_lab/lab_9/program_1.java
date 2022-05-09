import myPackage1.*;
import myPackage2.*;
public class program_1 {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(1, 7);
        System.out.println("Distance between points P1(3,4) and Origin(0,0) = "+p1.distance());
        System.out.println("Distance between points P1(3,4) and P2(1,7) = "+p1.distance(p2));
        System.out.println("Distance between points P1(3,4) and coordinates (8,8) = "+p1.distance(8, 8));

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("Distance between origins of circle C1 and C2 = "+c1.distance(c2));
        c1.checkWithin(p1);
        c1.checkWithin(p2);
    }
}
