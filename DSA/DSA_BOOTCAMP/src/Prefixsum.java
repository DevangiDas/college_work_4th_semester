import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

class Prefixsum
{
        public static int pivotIndex(int[] nums) {
            // Rounak's block
//           int sum_total = Arrays.stream(nums).sum();
//            int sum_main =0,ans=-1;
//            for (int i = 0; i < nums.length; i++) {
//                sum_main = sum_main+nums[i];
//                int sum_small = sum_main-nums[i];
//                if(sum_main==(sum_total-sum_small)) {
//                    ans = i;
//                    break;
//                }
            // Devangi's block
            int sum_total = Arrays.stream(nums).sum();
//            System.out.println(sum_total);
            int sum_main = 0,ans=-1;
            for (int i = 0; i < nums.length; i++) {
                sum_main = sum_main+nums[i];
//                System.out.println(sum_main);
                int sum_small = sum_main-nums[i];
                if(sum_main==(sum_total-sum_small)) {
                    ans = i;
                    break;
                }

            }

            return ans;
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++) {
            array[i] = in.nextInt();
        }
        int ans = pivotIndex(array);

           System.out.println(ans);

    }

}

