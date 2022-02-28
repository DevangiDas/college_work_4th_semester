/* Accept 10 numbers from command line and check how many of them are even and how many
odd. */

import java.io.*;

public class p6 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nEnter the elements of array one by one:");
        int arr_numbers[] = new int[10];
        int counter_even =0;
        int i = 0;
        while(i<10)
        {
            arr_numbers[i] = Integer.parseInt(in.readLine());
            i++;
        }
        i=0;
        while(i<10)
        {
            if (arr_numbers[i] % 2 == 0)
                counter_even++;
            else
                counter_even = counter_even + 0;
            i++;
        }
        System.out.println("\nEven Numbers are:\t" + counter_even);
        System.out.println("\nOdd Numbers are:\t" + (10 - counter_even));
        System.out.println("\n");


    }
}