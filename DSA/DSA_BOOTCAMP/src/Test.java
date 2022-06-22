import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static int[] getConcatenation(int[] nums) {

        int size = nums.length , n = 2*size;
        int[] ans = new int[n];
        for (int i = 0; i < size; i++)
        {
            ans[i] = nums[i];
            ans[i+size] = nums[i];
        }

        return(ans);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++) {
            array[i] = in.nextInt();
        }
        int[] ans = getConcatenation(array);
        System.out.println(Arrays.toString(ans));
    }
}
