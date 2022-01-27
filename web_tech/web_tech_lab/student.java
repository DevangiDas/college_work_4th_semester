import java.util.Scanner;

public class student 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");

        String name=sc.next();

        System.out.println("Enter your roll number");

        int roll_number = sc.nextInt();
        
        System.out.println("Enter your branch");

        String branch=sc.next();

        System.out.println("Name:\t"+name);

        System.out.println("Roll number:\t"+roll_number);

        System.out.println("Branch:\t" +branch);

    }
}
