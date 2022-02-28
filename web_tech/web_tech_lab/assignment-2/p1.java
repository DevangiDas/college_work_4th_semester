/* Program to print
your name, roll no, section and branch in separate lines. */

import java.io.*;

public class p1
     {
         public static void main(String[] args) throws IOException{
             BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

             System.out.println("Enter your name here");
             String name = in.readLine();
             System.out.println("Enter your Roll here");
             int roll_no = Integer.parseInt(in.readLine());
             System.out.println("Enter your SECTION here");
             String section = in.readLine();
             System.out.println("Enter your name here");
             String branch = in.readLine();
             System.out.println("\n\n\nNAME:\t\t" + name);
             System.out.println("ROLL:\t\t" + roll_no);
             System.out.println("SECTION:\t" + section);
             System.out.println("BRANCH:\t\t" + branch);
             System.out.println("\n");

        }
    }