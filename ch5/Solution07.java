package ch5;

/**
 * Created by apple on 10/15/15.
 */
public class Solution07 {
    public static void main(String[] args) {
        int original = 123;
        System.out.println(Integer.toBinaryString(original));
        System.out.println(Integer.toBinaryString(swapDigit1(original)));
        System.out.println(Integer.toBinaryString(swapDigit2(original)));
    }
// brute force: swap odd and even one by one.
    static int swapDigit1(int n){
        for(int i=0; i<32; i+=2){
            //System.out.println();
            //System.out.println(i);
            int even = (n & (1<<i))==0?0:1;
            int odd = (n & (1<<(i+1)))==0?0:1;
            //System.out.println(odd+" "+even);
            int temp = even;
            even = odd;
            odd = temp;
            //System.out.println(odd+" "+even);
            n = (even==0)? n & (~(1<<i)): n | (1<<i);
            //System.out.println(Integer.toBinaryString(n));
            n = (odd==0)? n & (~(1<<(i+1))):  n | (1<<(i+1));
            //System.out.println(Integer.toBinaryString(n));

        }
        return n;
    }
// use mask to get all odd digit number to shift it right
    // and get all even digit number to shift it left
    static int swapDigit2(int n){
        return ((n & 0xAA)>>1 ) | ( (n & 0x55555555)<<1 );
    }

}
