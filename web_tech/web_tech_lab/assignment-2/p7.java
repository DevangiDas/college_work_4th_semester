// Program to sort the user entered list of numbers of any size

import java.io.*;
import java.util.*;

public class p7 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> array = new ArrayList<Integer>();
        int i = 1;
        while (i != 0) {
            System.out.println("ENTER any number or enter 0 to stop entering numbers:");
            i = Integer.parseInt(in.readLine());
            if (i == 0)
                break;
            else
                array.add(i);
        }
        System.out.println("\nPrinting unsorted array:");
        System.out.println(array);

        Collections.sort(array);
        System.out.println("\nPrinting sorted array:");
        System.out.println(array);


    }
}