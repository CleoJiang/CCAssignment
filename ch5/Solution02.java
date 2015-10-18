package ch5;

import java.util.Scanner;
/**
 * Created by apple on 10/15/15.
 */
public class Solution02 {

    private static String getDecimal2(double decimal) {
        if(decimal>1 || decimal<0) return "error";

        StringBuilder binary = new StringBuilder();
        binary.append(".");
        // left shift n by 1 step(multiply n by 2)to check
        // whether current n is bigger than 1
        while(decimal>0){
            if(binary.length()>=32){
                return "error";
            }
            double n = decimal*2;
            if(n>=1){
                binary.append(1);
                decimal = n-1;
            }
            else {
                binary.append(0);

                decimal = n;
            }

        }
        return binary.toString();
    }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double decimal = in.nextDouble();
        System.out.println(getDecimal2(decimal));



    }

}
