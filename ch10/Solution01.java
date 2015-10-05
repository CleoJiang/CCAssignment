package ch10;

/**
 * Created by apple on 9/25/15.
 */
public class Solution01 {

    public static void main(String[] args) {
        int[] longer = new int[8];
        longer[0]=2; longer[1]=4; longer[2]=6; longer[3]=7; longer[4]=8;
        int[] shorter = {1,3,5};
        merge(longer,shorter);
        System.out.println(longer);

    }


    // from the end of two string, compare each element one by one.
    // put the bigger one into the end of the longer string to form the new sorted array
    public static void merge(int[] a, int[] b){
        int aEnd = a.length-1;
        int bEnd = b.length-1;
        int mergeEnd = aEnd + bEnd - 1;

        while(bEnd>=0){
            if(aEnd>=0 && a[aEnd]>b[bEnd]){
                a[mergeEnd]=a[aEnd];
                aEnd--;
            }else {
                a[mergeEnd]=b[bEnd];
                bEnd--;
            }
            mergeEnd--;
        }







    }

}
