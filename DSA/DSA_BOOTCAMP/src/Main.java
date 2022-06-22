import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int maximumWealth(int[][] nums) {

        int size = nums[0].length;
        int size_r= nums.length,max=0;
        int sum = 0;
        for (int i = 0; i < size_r; i++)
        {
            for (int j = 0; j < size; j++) {
                sum = sum + nums[i][j];
            }
            if(sum >= max)
                max=sum;
                sum=0;
        }
        return(max);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int size_row = in.nextInt() , size_col = in.nextInt();
        int[][] array = new int[size_row][size_col];
        for(int i=0;i<size_row;i++) {
            for (int j = 0; j < size_col; j++) {
                array[i][j] = in.nextInt();
            }
        }
        int ans = maximumWealth(array);
//        System.out.println(Arrays.toString(array));
        System.out.println(ans);
    }
}