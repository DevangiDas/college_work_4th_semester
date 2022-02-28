//Find the no. of occurrence of each element in an user entered list of nos.

import java.io.*;
import java.util.*;

public class p9 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nEnter the number of objects in the array:");
        int size = Integer.parseInt(in.readLine());
        int i = 0;
        int array[] = new int[size];
        while (i < size) {
            System.out.print("Enter the number:\t");
            array[i] = Integer.parseInt(in.readLine());
            System.out.println("");
            i++;
        }
        Arrays.sort(array);
        ArrayList<Integer> distinct_array = new ArrayList<Integer>();
        ArrayList<Integer> occurence = new ArrayList<Integer>();
        int j = 1;
        int count = 1;
        distinct_array.add(array[0]);
        while (j < size) {
            if (array[j] == array[j - 1]) {
                count++;

            } else if (array[j] != array[j - 1]) {
                distinct_array.add(array[j]);
                occurence.add(count);
                count = 1;
            }

            j++;
        }
        occurence.add(count);
        // System.out.println(distinct_array);
        // System.out.println(occurence);
        System.out.println("\nThe disint elenemts and there occurence are:");
        int distinct_size = distinct_array.size();
        for (int k = 0; k < distinct_size; k++) {
            System.out.println(distinct_array.get(k) + " : " + occurence.get(k));
        }

    }
}

