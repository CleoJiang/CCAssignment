package ch5;

import java.util.Queue;

/**
 * Created by apple on 10/15/15.
 */
public class Solution04 {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(Integer.toBinaryString(n));
        System.out.println();
        System.out.println("*****Brute force*****");
        System.out.println("next minimum: " + Integer.toBinaryString(nextMin(n)));
        System.out.println("prev maximum: " + Integer.toBinaryString(preMax(n)));
        System.out.println();
        System.out.println("*****Optimized*****");
        System.out.println("next minimum: " + Integer.toBinaryString(nextMin2(n)));
        System.out.println("prev maximum: " + Integer.toBinaryString(preMax2(n)));
    }

    //brute force:
    //
    // check every later number or every before number of n until find the one with same numbers of 1
    // the method to count numbers of n in its binary form is to go through 32 digits.
    static int get1Nums(int n) {
        int length = 32;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if ((n & (1 << i)) != 0)
                count++;
        }
        return count;
    }

    static int nextMin(int n) {
        int Nums = get1Nums(n);
        int nextMin = 0;
        while (true) {
            n++;
            if (get1Nums(n) == Nums) {
                nextMin = n;
                break;
            }
        }
        return nextMin;
    }

    static int preMax(int n) {
        int Nums = get1Nums(n);
        int preMax = 0;
        while (n >= 0) {
            n--;
            if (get1Nums(n) == Nums) {
                preMax = n;
                break;
            }
        }
        return preMax == 0 ? -1 : preMax;
    }

    // optimized method:
    //
    // the next number with same 1 should have one 1 turned into 0 and one 0 turned into 1
    // the minimum next number is bigger than n, but not very big, so we should find a 0 to be turned into 1
    // from left to right.
    static int nextMin2(int n) {
        int length = 32;
        int nextMin = 0;
        if (n == 0) return -1;

        for (int i = 1; i < length; i++) {
            if ((n & (1 << i)) == 0 && (n & (1 << (i - 1))) != 0) {
                //System.out.println(i);
                n = n | (1 << i);
                //System.out.println(Integer.toBinaryString(n));
                n = n & (~(1 << (i - 1)));
                //System.out.println(Integer.toBinaryString(n));
                nextMin = n;
                break;
            }
        }
        return nextMin;
    }
    static int preMax2(int n) {

        int length = 32;
        int preMax = 0;
        //if (n == 0) return -1;

        for (int i = length-1; i > 0; i--) {
            if ((n & (1 << i)) != 0 && (n & (1 << (i - 1))) == 0) {
                //    System.out.println(i);
                n = n & (~(1 << (i)));
                n = n | (1 << (i-1));
                //System.out.println(Integer.toBinaryString(n));

                //System.out.println(Integer.toBinaryString(n));
                preMax = n;
                break;
            }
        }
        return preMax;
    }


}








