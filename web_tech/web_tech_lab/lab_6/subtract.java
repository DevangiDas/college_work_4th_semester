// Write a program to overload subtract method with various parameters in a class inJava

import java.io.*;

class sub {
    public void subtract(int a, int b) {
        System.out.println(a + " - "+ b +" = "  + (a - b));
    }

    public void subtract(double a, double b) {
        System.out.println(a + " - "+ b +" = "  + (a - b));
    }

    public void subtract(int a, double b) {
        System.out.println(a + " - "+ b +" = "  + (a - b));
    }

    public void subtract(double a, int b) {
        System.out.println(a + " - "+ b +" = "  + (a - b));
    }
};

    public class subtract{
        public static void main(String[] args) throws IOException {
            sub obj = new sub();
            obj.subtract(23, 11);
            obj.subtract(62.5, 15.2);
            obj.subtract(30, 14.2);
            obj.subtract(33.5, 15);
        }
    }