package test;

/**
 * Created by apple on 10/15/15.
 */
public class test {
    public static int getMaxSum(int[] s){

        int tempmax=0,max=0;
        for(int i: s){
            tempmax = Math.max(tempmax+i,i);
            max = Math.max(max,tempmax);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] seq = {1,3,5,8,-1,4,4,9,1,3};
        System.out.println(getMaxSum(seq));
    }
}
