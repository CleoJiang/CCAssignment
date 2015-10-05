package ch10;

import java.util.ArrayList;

/**
 * Created by apple on 9/27/15.
 */
//
public class Solution04 {

    //generally use binary search

    //because the size is unknown, we could double a index to find at least its boundary
    //so we could use binary search

    public int search(Listy list, int target){
        int i = 1;
        while(list.elementAt(i)!=-1 && list.elementAt(i)<target){
            i = i*2;
        }
        return binarySearch(list,target, i/2, i);
    }

    private int binarySearch(Listy list, int target,int low, int high) {
        while(low<high) {
            int mid = list.elementAt((low + high) / 2);
            if (mid == -1 || mid > target) high = mid - 1;
            else if (mid < target) low = mid + 1;
            else return mid;
        }
        return -1;
    }

    private class Listy{
        ArrayList<Integer> list;
        Listy(){
            list = new ArrayList<Integer>();
        }
      public int elementAt(int index){
        return list.get(index);
      }
    };

}
