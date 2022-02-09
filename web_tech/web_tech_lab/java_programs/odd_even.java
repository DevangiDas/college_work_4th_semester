import java.util.Scanner;

public class odd_even 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number_1 = sc.nextInt();

        if(number_1%2==0)
        {
            System.out.println("Number is Even");
        }
        else 
        {
            System.out.println("Number is odd");
        }



    }
    
}
