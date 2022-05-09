import java.io.IOException;
import java.util.*;

public class sort_names {
    public static void sortNames(String[] names) {
        int n = names.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        int n = args.length;
        if (n > 0) {
            sortNames(args);
            System.out.println("After sorting : ");
            for (String string : args) {
                System.out.print(string + " ");

            }
            System.out.println("");
        } 
        else 
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of names to sort: ");
            int l = sc.nextInt();
            String names[] = new String[l];
            System.out.print("Enter " + l + " names to sort: ");
            for (int i = 0; i < l; i++) 
            {
                names[i] = sc.next();
            }
            sortNames(names);
            System.out.println("After sorting : ");
            for (String string : names) {
                System.out.print(string + " ");

            }
            System.out.println("");
        }
    }
}
