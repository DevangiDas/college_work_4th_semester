/*Program to print the corresponding grade for the given mark using if..else statement in Java*/

import java.io.*;

     public class p2{
         public static void main(String[] args) throws IOException{
             BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            
             System.out.print("Enter your marks here:\t");
             int marks = Integer.parseInt(in.readLine());
             if(marks>=90 && marks<=100)
                 System.out.println("GRADE IS O\n");
             else if(marks>=80 && marks<=89)
                 System.out.println("GRADE IS E\n");
             else if(marks>=70 && marks<=79)
                 System.out.println("GRADE IS A\n");
             else if(marks>=60 && marks<=69)
                System.out.println("GRADE IS B\n");
             else if(marks>=50 && marks<=59)
                 System.out.println("GRADE IS C\n");
             else if(marks>=40 && marks<=49)
                 System.out.println("GRADE IS A\n");
             else
                 System.out.println("GRADE IS F\n");
                              
        }
    }