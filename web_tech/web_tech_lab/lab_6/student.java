/* Write a program in java to input and display the details of n number of
students having roll, name and cgpa as data members. Also display the name of the student having lowest cgpa. */

import java.io.*;

class test {
    int rollNo;
    String name;
    double cgpa;

     public void getDetails(int rollNo, String name, double cgpa){
        this.rollNo=rollNo;
        this.name=name;
        this.cgpa=cgpa;
     }
}
public class student {
   public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the no. of Students that have participated: ");
      int n = Integer.parseInt(in.readLine());
       
      test[] student_object = new test[n];
      
      int temp_roll;
      String temp_name;
      double temp_cgpa;

      for(int i=0;i<n;i++){
         System.out.print("\nEnter Student's Roll No: ");
         temp_roll = Integer.parseInt(in.readLine());
         System.out.print("Enter Student's Name: ");
         temp_name = in.readLine();
         System.out.print("Enter Student's CGPA: ");
         temp_cgpa = Double.parseDouble(in.readLine());
         student_object[i] = new test();
         student_object[i].getDetails(temp_roll, temp_name, temp_cgpa);
      }
      in.close();

      String lowest = student_object[0].name;
      for(int i=1;i<n;i++){
         if(student_object[i-1].cgpa>student_object[i].cgpa)
            lowest=student_object[i].name;
      }
      System.out.println("\nStudent with lowest cgpa is: " + lowest);
   }
}
