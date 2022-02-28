/* Program to check a user entered number is palindrome or not */

import java.io.*;

public class p4 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter a number:\t");
        int number = Integer.parseInt(in.readLine());
        int number_backup = number;
        int remainder;
        int new_number = 0;
        while (number != 0) 
        {
            remainder = number % 10;
            new_number = (new_number * 10) + remainder;
            number = number / 10;
        }
        System.out.println("\nThe number was:\t" + number_backup);
        if (number_backup == new_number)
            System.out.println("The number is palindrome.\n");
        else
            System.out.println("The number is not palindrome.\n");
    }
}