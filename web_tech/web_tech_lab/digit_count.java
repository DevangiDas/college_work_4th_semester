import java.io.*;
public class digit_count {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any Number: ");
        int number = Integer.parseInt(x.readLine());

        // int backup_number = number;
        int counter = 0;
        while(number!=0)
        {
            
            number = number / 10;
            counter++;
        }
        System.out.print("Number of digits:\t"+ counter);
    }
}
