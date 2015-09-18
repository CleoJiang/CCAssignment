package ch1;



/**
 * Created by minhuij on 9/11/15.
 */
public class Solution05 {


    public static boolean is_oneEdit(String s1, String s2) {

        int count = 0;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    count++;
                }
            }

        } else if (Math.abs(s1.length() - s2.length()) == 1) {

            if (s1.length() - s2.length() < 0) {
                String t = s1;
                s1 = s2;
                s2 = t;
            }
            int i = 0;
            for (; i < s2.length();i++) {
                if (s2.charAt(i) != s1.charAt(i)) {
                    count++;
                    break;
                }
            }
            is_oneEdit(s2.substring(i),s1.substring(i+1));
        } else {
            return false;
        }
        if (count == 1) return true;
        else return false;

    }




    public static void main(String[] args) {


        System.out.println(Solution05.is_oneEdit("pale", "ple"));
        System.out.println(Solution05.is_oneEdit("pales", "pale"));
        System.out.println(Solution05.is_oneEdit("pale", "bale"));
        System.out.println(Solution05.is_oneEdit("pale", "bake"));


    }


}
