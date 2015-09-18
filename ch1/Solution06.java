package ch1;

/**
 * Created by minhuij on 9/13/15.
 */
public class Solution06 {


    public static String string_compression(String s) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        char[] newCharArray = new char[2 * n];
        int m = 0, count = 1, flag = 0;

        for (int i = 1; i < n; i++) {
            if (charArray[i] == charArray[flag]) {
                count++;
                if (i == n - 1) {
                    newCharArray[m++] = charArray[flag];
                    newCharArray[m++] = (char) (count + '0');
                }
            } else {
                newCharArray[m++] = charArray[flag];
                newCharArray[m++] = (char) (count + '0');
                flag = i;
                count = 1;
                if (flag == n - 1) {
                    newCharArray[m++] = charArray[flag];
                    newCharArray[m++] = (char) (count + '0');
                }
            }
        }
        String original = new String(charArray).trim();
        String result = new String(newCharArray).trim();
        if (2 * (original.length()) == result.length()) return original;
        else return result;

    }

    public static void main(String[] args) {
        String s1 = new String("aabcccccaaa");
        String s2 = new String("abcdef");

        System.out.println(s1);
        System.out.println(Solution06.string_compression(s1));
        System.out.println();
        System.out.println(s2);
        System.out.println(Solution06.string_compression(s2));

    }


}
