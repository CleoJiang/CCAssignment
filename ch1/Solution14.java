package ch1;

/**
 * Created by minhuij on 9/11/15.
 */
public class Solution14 {
    public static boolean palindrome_permutation(String s){

        char c[] = s.toCharArray();
        int result=0;
        for(int i=0; i<c.length; i++){
            result=result^c[i];
        }

        if(result == 0) return true;
        else{
            for (int i=0; i<c.length; i++){
                if(c[i]==result) return true;
            }
        return false;

        }
    }
}

