package test;


import java.io.*;
import java.util.*;
import java.math.*;

/**
 * Created by apple on 10/15/15.
 */
public class S {
    public static long[] getPath(char [][] grid){
        long result[] = new long[2];
        int L=grid.length;
        int C= grid[0].length;
        int[][] layer = new int[L][C];
        for(int i = 0; i < L; i++){
            for(int j = 0; j < C; j++){
                layer[i][j] = Integer.MAX_VALUE;
            }
        }
        layer[0][0] = 0;
        Queue<Integer> nodes = new ArrayDeque<Integer>();
        nodes.add(0);
        long [][] A = new long[L][C];
        A[0][0] = 1;
        while(!nodes.isEmpty()){
            int temp = nodes.poll();
            int m = temp / C;
            int n = temp % C;
            int currentLayer = layer[m][n];
            if(m-1 >= 0 && grid[m-1][n] != 'x'){
                if(layer[m - 1][n] == Integer.MAX_VALUE){
                    //	System.out.println("aaaa");

                    A[m-1][n] = (long) ((A[m-1][n] + A[m][n]) % (1E9 + 7)) ;
                    nodes.add(temp - C);
                    layer[m-1][n] = currentLayer + 1;
                    //System.out.println((m-1) + "," + n + ":" + currentLayer+1);
                }
                else if(layer[m - 1][n] == currentLayer+1){
                    A[m-1][n] = (long) ((A[m-1][n] + A[m][n]) % (1E9 + 7)) ;
                }
            }
            if(m+1 < L && grid[m+1][n] != 'x'){
                //System.out.println("aaa");
                if(layer[m+1][n] == Integer.MAX_VALUE){

                    A[m+1][n] = (long) ((A[m+1][n] + A[m][n])% (1E9 + 7));
                    nodes.add(temp + C);
                    layer[m + 1][n] = currentLayer + 1;
                    //	System.out.println((m+1) + "," + n + ":" + currentLayer+1);

                }
                else if(layer[m+1][n] == currentLayer+1){
                    A[m+1][n] = (long) ((A[m+1][n] + A[m][n])% (1E9 + 7));
                }
            }
            if(n-1 >= 0 && grid[m][n-1] != 'x'){
                //System.out.println("aa);
                if(layer[m][n-1] == Integer.MAX_VALUE){

                    A[m][n-1] = (long) ((A[m][n-1] + A[m][n]) % (1E9 + 7));
                    nodes.add(temp - 1);
                    layer[m][n-1] = currentLayer + 1;
                    //System.out.println(m + "," + (n-1) + ":" + currentLayer+1);


                }
                else if(layer[m][n-1] == currentLayer+1){
                    A[m][n-1] = (long) ((A[m][n-1] + A[m][n]) % (1E9 + 7));

                }
            }
            if(n+1 < C && grid[m][n+1] != 'x'){
                //System.out.println("a");
                if(layer[m][n+1] == Integer.MAX_VALUE){

                    A[m][n+1] = (long) ((A[m][n+1] + A[m][n])% (1E9 + 7));
                    nodes.add(temp + 1);
                    layer[m][n+1] = currentLayer + 1;
                    //	System.out.println(m + "," + (n+1) + ":" + currentLayer+1);

                }
                else if(layer[m][n+1] == currentLayer+1){
                    A[m][n+1] = (long) ((A[m][n+1] + A[m][n])% (1E9 + 7));
                }
            }

        }
        result[0] = A[L-1][C-1];

        if(layer[L-1][C-1] == Integer.MAX_VALUE){
            result[1] = -1;
        }else{
            result[1] = layer[L-1][C-1];
        }
        return result;

    }


    public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        String[] split = in.nextLine().split(" ");
        int M = Integer.parseInt(split[0]);
        int N = Integer.parseInt(split[1]);
        char[][] map = new char[M][N];
        for(int i=0; i<M; i++) {
            map[i] = in.nextLine().toCharArray();
        }
        long[] result = getPath(map);
        for(long c : result)
            System.out.println(c);
        in.close();
    }
}
