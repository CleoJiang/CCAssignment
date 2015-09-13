package test;

import ch1.Solution1_7;

/**
 * Created by apple on 9/11/15.
 */
public class Test1_7 {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        int[][] matrix={{1,2},{3,4}};

        int n=matrix.length;
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] ma = Solution1_7.rotate_image(matrix);
        int m=ma.length;
        for (int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                System.out.print(ma[i][j] + " ");
            }
            System.out.println();
        }



    }
}
