package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by apple on 10/15/15.
 */
public class box {

    static long highestStack(int[][] boxes) {
        int num = boxes.length;
        Arrays.sort(boxes, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                // TODO Auto-generated method stub
                return o1[0] - o2[0];
            }
        });

        long[] dp = new long[num];

        for (int i=0; i<num; i++){
            dp[i]=boxes[i][2];
            for (int j=0; j<i; j++){
                if (boxes[j][0]<boxes[i][0] && boxes[j][1]<boxes[i][1]){
                    dp[i]=Math.max(dp[i],dp[j]+boxes[i][2]);
                }
            }
        }
        return dp[num-1];

    }








    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine().trim());
        int[][] boxes = new int[N][3];
        for (int i = 0; i < N; i++) {
            String[] split = in.nextLine().split(" ");
            for (int j = 0; j < split.length; j++) {
                boxes[i][j] = Integer.parseInt(split[j]);
            }
        }
        System.out.println(highestStack(boxes));
        in.close();
    }
}

