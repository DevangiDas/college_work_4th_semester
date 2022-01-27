import java.io.*;
public class leap_year {
    public static void main(String[] args) throws IOException{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any year: ");
        int y = Integer.parseInt(x.readLine());

        if((y%4==0 && y%100!=0) || y%400==0)
        System.out.println("Leap Year");
        else
        System.out.println("Not a Leap Year");
    }
}