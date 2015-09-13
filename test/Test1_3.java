package test;

import ch1.Solution1_3;

/**
 * Created by apple on 9/11/15.
 */
public class Test1_3 {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        char[] c = "Mr John Smith                             ".toCharArray();
        System.out.println(Solution1_3.URlify( c ,13));
    }

}
