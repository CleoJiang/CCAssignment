package ch1;

import java.util.Arrays;


/**
 * Created by minhuij on 9/11/15.
 */
public class Solution02 {

    /*Sort these two string and compare their characters one by one*/
    public static boolean is_permutation(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        if (c1.length != c2.length) return false;

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(Solution02.is_permutation("abcd", "dcba"));
        System.out.println(Solution02.is_permutation("abc", "dcba"));
        System.out.println(Solution02.is_permutation("abce", "dcba"));
    }


}
