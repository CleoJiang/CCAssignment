package ch1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by minhuij on 9/11/15.
 */
public class Solution04 {
    /*count numbers of each character and check for the odd number*/
    public static boolean palindrome_permutation(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i=0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i))) map.put(s.charAt(i), map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
        }

        int oddNum=0;
        for (int v: map.values()){
            if (v%2!=0) oddNum++;
        }
        if (oddNum>1) return false;
        return true;


    }

    public static void main(String[] args) {
        System.out.println(Solution04.palindrome_permutation("Tact Coa"));
    }


}

