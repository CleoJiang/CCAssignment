package ch1;

/**
 * Created by minhuij on 9/13/15.
 */
public class Solution08 {


    public static void zero_matrix(int[][] matrix) {
        int n = matrix.length;
        int[] rowZero = new int[n];
        int[] columnZero = new int[n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = columnZero[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (rowZero[i] == 1) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            if (columnZero[j] == 1) {
                for (int i = 0; i < n; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

    }


    public static void main(String[] args) {
        int[][] matrix = {{0, 1}, {2, 3}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        Solution08.zero_matrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }


}
