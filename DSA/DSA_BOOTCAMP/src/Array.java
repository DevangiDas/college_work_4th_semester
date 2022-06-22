import java.io.*;
import java.util.*;
class Array {
    public static int[] runningSum(int[] nums) {
        int size = nums.length;
        int[] running = new int[size];
        running[0] = nums[0];
//        for (int i = 0; i < size; i++) {
//            int sum =0;
//            for (int j = 0; j < i; j++) {
//                sum = sum + nums[j];
//                running[i]= sum;
//            }
        for (int i = 1; i < size; i++) {
//            int sum =0;
//            for (int j = 0; j < i; j++) {
//                sum = sum + nums[j];
                running[i]= nums[i] + running[i-1];
//            }

//            sum =0;
        }
        return(running);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++) {
            array[i] = in.nextInt();
        }
        int[] ans = runningSum(array);
        System.out.println(Arrays.toString(ans));
    }
}
