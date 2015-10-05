package ch10;

/**
 * Created by apple on 9/27/15.
 */
public class Solution09 {
    public boolean searchMatrix(int[][] array, int target){
        int M = array.length;
        int N = array[0].length;

        //start from the most right element in the first row
        // because element increasing from left to right, from up to down
        //each time we find the current element is bigger than target, move current left
        //each time we find the current element is smaller than target, move current down
        int row = 0;
        int col = N-1;
        while(row<=M && col>=0) {
            if (array[row][col] == target) return true;
            else if (array[row][col] < target) row++;
            else col--;
        }

        return false;

    }
}
