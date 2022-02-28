/*Write a program in java to define a class Shape which has data member „area‟ and a
member function showArea(). Derive two classes Circle and Rectangle from Shape
class. Add appropriate data members and member functions to calculate and display
the area ofCircle and Rectangle. */

class Shape{
    double area;
    public void showArea(){
        System.out.println("Area is: "+ String.format("%.3f", area) +" square units");
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
        area=3.14*radius*radius;
        System.out.print("Circle ");
    }
}
class Rectangle extends Shape{
    double length, breadth;
    Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
        area=length*breadth;
        System.out.print("Rectangle ");
    }
}

public class p4 {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        c.showArea();

        Rectangle r = new Rectangle(7.9, 8.3);
        r.showArea();
    }
}

