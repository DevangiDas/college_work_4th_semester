import java.util.Scanner;

public class arithmetic_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number_1 = sc.nextInt();

        System.out.println("Enter a number");

        int number_2 = sc.nextInt();

        int add = number_1 + number_2;

        int sub = number_1 - number_2;

        int multiply = number_1 * number_2;

        System.out.println("Addition:\t" + add);

        System.out.println("Addition:\t" + sub);

        System.out.println("Addition:\t" + multiply);

    }

}

