package ch1;

import java.util.Arrays;


/**
 * Created by minhuij on 9/10/15.
 */
public class Solution01 {

    /*Sort string and compare the neighbor*/
    public static boolean is_unique(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);

        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Solution01.is_unique("112"));
        System.out.println(Solution01.is_unique("123"));
    }


}
