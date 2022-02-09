/*Write a program which will overload the area () method and display 
the area of acircle, triangle and square as per user choice and user entered dimensions*/

import java.io.*;

class test {
    public void area(double r){
        System.out.println("Area of Circle is: " + String.format("%.3f", (3.14*r*r)) + " square units");
    }
    public void area(double l, double b){
        System.out.println("Area of Square: " + (l*b) + " square units");
    }

    public void area(double a, double b, double c) {
        double S = (a + b + c) / 2;
        System.out.println("Area of Triangle is: " + String.format("%.3f", Math.sqrt(S * (S - a) * (S - b) * (S - c)))
                + " square units");
    }
};

    public class areas{
    public static void main(String[] args) {
        test obj = new test();
        obj.area(4);
        obj.area(3,6);
        obj.area(12,5,13);
    }
}