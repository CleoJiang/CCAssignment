package ch1;



/**
 * Created by minhuij on 9/13/15.
 */
public class Solution09 {
    public static boolean is_rotation(String s1, String s2) {
        if (s1.length()!=s2.length() || s1.length()==0) return false;
        String s = s1+s1;
        if (s2.contains(s1)) return true;
        return false;
    }
}
