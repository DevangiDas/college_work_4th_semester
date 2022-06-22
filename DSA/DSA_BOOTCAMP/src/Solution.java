import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int[] buildArray(int[] nums) {

        int size = nums.length;
        int[] ans = new int[size];
        for (int i = 0; i < size; i++)
        {
            ans[i] = nums[nums[i]];
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
            int[] ans = buildArray(array);
            System.out.println(Arrays.toString(ans));
        }
}

