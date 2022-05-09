package myPackage2;
import java.util.*;
import myPackage1.*;
public class Circle {
    private double radius;
    private Point center;
    private static Scanner sc = new Scanner(System.in);
    public Circle()
    {
        System.out.print("Enter coordinates of center of circle: ");
        center = new Point(sc.nextDouble(), sc.nextDouble());
        System.out.print("Enter radius of circle: ");
        radius = sc.nextDouble();
    }
    public double distance(Circle another)
    {
        return center.distance(another.center);
    }
    public void checkWithin(Point p)
    {
        double dist = center.distance(p);
        System.out.print("The point ("+p.X+","+p.Y+") is ");
        if(dist < radius)
        System.out.println("inside the circle");
        if(dist == radius)
        System.out.println("on the circle");
        if(dist > radius)
        System.out.println("outside the circle");
    }
}
