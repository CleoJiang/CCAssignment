package ch5;

/**
 * Created by apple on 10/15/15.
 */
public class Solution03 {
    int longest(int n){
        int max = 0;
        for(int i=0; i<32; i++){
            max = Math.max(max, longestSep1(n,i));
        }
        return max;
    }
    int longestSep1(int n, int ignore){
        int max=0;
        int count=0;
        for(int i=0; i<32; i++){
            if (i==ignore || getBit(n,i)){
                count++;
                max = Math.max(count,max);
            }else {
                count=0;
            }
        }
        return max;
    }
    boolean getBit(int num, int i){
        return ((num & (1<<i)) != 0);
    }

}
