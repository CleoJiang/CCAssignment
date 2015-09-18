package ch1;


/**
 * Created by minhuij on 9/11/15.
 */
public class Solution07 {

    public static void rotate_image(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][n - i - 1];
                matrix[n - j - 1][n - i - 1] = t;
            }
        }

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = t;
            }
        }

    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        Solution07.rotate_image(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }


}
