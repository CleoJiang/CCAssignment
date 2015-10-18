package ch5;

/**
 * Created by apple on 10/15/15.
 */
public class Solution06 {
    public static void main(String[] args) {
        int a=29;
        int b=15;
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));
        System.out.println(Convertion1(a, b));
        System.out.println(Convertion2(a, b));
    }

    // brute force: compare the bit of a and b one by one, repeat using getBit.
    static int Convertion1(int a, int b){
        int length = 32;
        int count=0;
        for(int i=0; i<length; i++){
            if ( (a & (1<<i)) != ( b & (1<<i)) )
                count++;
        }
        return count;
    }

    // xor operation to get different digits of a and b
    static int Convertion2(int a, int b){
        int count = 0;
        for(int c = a^b; c!=0; c = c >> 1){
            count+= c&1;
        }
        return count;
    }



}
