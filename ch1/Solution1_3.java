package ch1;


/**
 * Created by minhuij on 9/11/15.
 * Discuss with junzhou1.
 */
public class Solution1_3 {
    public static char[] URlify(char[] c, int num) {
        int count = 0;

        for (int i = 0; i < num; i++) {
            if (c[i] == ' ') count += 3;
            if (c[i] != ' ') count += 1;
        }
        for (int i = num-1, j = count - 1; i >= 0; i--) {
            if (c[i] != ' ') {
                c[j] = c[i];
                if (j >= 1) {
                    j = j - 1;
                }
            }
            if (c[i] == ' ') {
                c[j] = '0';
                c[j - 1] = '2';
                c[j - 2] = '%';
                j = j - 3;
            }
        }
        return c;


    }
}
