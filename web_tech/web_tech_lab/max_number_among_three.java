import java.util.Scanner;

public class max_number_among_three 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number_1 = sc.nextInt();

        System.out.println("Enter a number");

        int number_2 = sc.nextInt();

        System.out.println("Enter a number");

        int number_3 = sc.nextInt();

        int max = 0;
         
        if(number_1 > number_2)
            max = number_1;
        else if(number_1< number_2)
            max = number_2;
        
        if(number_3 > max)
            max = number_3;
        

            System.out.println("Max number:\t" + max);




    }
}