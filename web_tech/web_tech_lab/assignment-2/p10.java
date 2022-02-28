/* Find sum of each diagonal (left &amp; right) elements separately of a user entered 3 X 3 matrixes in
 Java.*/

import java.io.*;

public class p10 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int i, j, row, col, sum_right_diagonal = 0 , sum_left_diagonal = 0;
        System.out.println("\nEnter the number of rows:");
        row = Integer.parseInt(in.readLine());
        System.out.println("Enter the number of columns:");
        col = Integer.parseInt(in.readLine());

        int[][] matrix = new int[row][col];

        System.out.println("Enter the elements of the matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(in.readLine());
            }
        }

        System.out.println("The elements of the matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i == j) 
                {
                    sum_right_diagonal = sum_right_diagonal + matrix[i][j];
                }
                if ((i + j) == (row - 1))
                {
                    sum_left_diagonal = sum_left_diagonal + matrix[i][j];
                }
            }
        }

        System.out.println("\nSUM of RIGHT_DIAGONAL elements of the matrix = " + sum_right_diagonal);
        System.out.println("SUM of LEFT_DIAGONAL elements of the matrix = " + sum_left_diagonal);
        System.out.println("\n");

    }
}
