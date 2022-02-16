/* Write a program in Java to define a class Rectangle having data member: 
lengthand breadth; to calculate the area and perimeter of the rectangle. 
Use member functions to read, calculate and display.*/

import java.io.*;

class test {
    double lenght;
    double breadth;

    public void get_info(double lenght, double breadth){
        this.lenght=lenght;
        this.breadth=breadth;
    }
    public double area(){
        return lenght*breadth;
    }
    public double perimeter(){
        return (2*(lenght+breadth));
    }
    public void display(){
        System.out.println("\nArea of the Rectangle is: "); 
        System.out.println(String.format("%.3f", area()) + " sq_units\n\n");
        System.out.println("Perimeter of the Rectangle is: ");
        System.out.println(String.format("%.3f", perimeter()) + " units\n\n");
    }
};
public class rectangle {
    public static void main(String[] args) {
        test obj = new test();
        obj.get_info(6.9,2.6);
        obj.display();
    }
}
