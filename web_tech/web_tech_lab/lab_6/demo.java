/*  Write a class file – box with three data members(length, width, height) and a methodvolume() . Also implement 
the application class Demo where an object of thebox class is created with user entered dimensions and volume is printed. */


import java.io.*;
class box {
    int len;
    int br;
    int ht;

    void volume(int a,int b,int c)
    {
        len = a;
        br = b;
        ht = c;
    }

    void display()
    {
        int result = 0;
        result = len * br * ht;
        System.out.println(result);
    }
};


     public class demo{
         public static void main(String[] args) throws IOException{
             box object_1 = new box();
             object_1.volume(10, 20, 30);
             object_1.display();

            
        }
    }