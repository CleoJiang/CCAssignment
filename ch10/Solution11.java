package ch10;

import java.util.Arrays;

/**
 * Created by apple on 9/27/15.
 */
public class Solution11 {

    // first sort the array in increasing order
    //each time, jump 2 steps, swap the middle one and the small one,
    void sortValley(int[] array){
        Arrays.sort(array);
        for(int i = 1; i<array.length; i=i+2){
            int t = array[i];
            array[i] = array[i-1];
            array[i-1] = t;
        }
    }
}
