package ch5;

import java.util.Scanner;

/**
 * Created by apple on 10/15/15.
 */
public class Solution01 {

    public static int mergeMN(int M, int N, int i, int j){
//        System.out.println(Integer.toBinaryString(N));
//        System.out.println(Integer.toBinaryString(M));
        int one = ~0;
//        System.out.println(Integer.toBinaryString(one));

        //clear digit from i to j.
        int mask = (one<<(j+1))|((1<<i)-1);
//        System.out.println(Integer.toBinaryString(mask));
        int newN = N & mask;
//        System.out.println(Integer.toBinaryString(newN));

        //merge m into cleared n
        int merge = (M<<i) | newN;
        return merge;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String input0 = "10000000000";
//        String input1 = "10011";
//        10000000000
//        10011
        int N = Integer.parseInt(in.nextLine(),2);
        int M = Integer.parseInt(in.nextLine(),2);
        int i = Integer.parseInt(in.nextLine());
        int j = Integer.parseInt(in.nextLine());
//        int N= Integer.parseInt(input0, 2);
//        int M = Integer.parseInt(input1, 2);
        int merge = mergeMN(M ,N , i, j);
        System.out.println(Integer.toBinaryString(merge));

    }




}
