/* Find the largest among 3 user entered nos. at the command prompt using Java */

import java.io.*;

public class p5 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nENTER THREE NUMBERS SIMULTANEOUSLY:");
        int number_1 = Integer.parseInt(in.readLine());
        int number_2 = Integer.parseInt(in.readLine());
        int number_3 = Integer.parseInt(in.readLine());
        int max_number=0;
        if (number_1 > number_2 && number_1 > number_3)
            max_number = number_1;
        else if (number_2 > number_3 && number_2 > number_1)
            max_number = number_2;
        else
            max_number = number_3;
        System.out.println("THE GREATEST NUMBER IS:\t"+max_number);

    }
}