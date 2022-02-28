/*Program to print the corresponding week day for the given day no. of the current month using
switch..case statement in Java*/

import java.io.*;

public class p3 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of day:\t");
        int day_number = Integer.parseInt(in.readLine());
        switch (day_number) {
            case 1:
                System.out.println("SUNDAY\n");
                break;
            case 2:
                System.out.println("MONDAY\n");
                break;
            case 3:
                System.out.println("TUEDAY\n");
                break;
            case 4:
                System.out.println("WEDNESDAY\n");
                break;
            case 5:
                System.out.println("THURSDAY\n");
                break;
            case 6:
                System.out.println("FRIDAY\n");
                break;
            case 7:
                System.out.println("SATURDAY\n");
                break;
            default:
                System.out.println("WRONG DAY_NUMBER ENTERED\n");
                break;
        }

    }
}