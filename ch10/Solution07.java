package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by apple on 9/27/15.
 */
public class Solution07 {

    long numberOfInt = (long)Integer.MAX_VALUE;
    int[] bitset = new int[(int) (numberOfInt/32)+1];
    String filename = "";

    void findnumber() throws FileNotFoundException{
        Scanner in = new Scanner(new FileReader(filename));
        //store all the number appearing in the file into the bit vector.
        while(in.hasNext()){
            int n = in.nextInt();
            //bit start from 0 while number start from 1;
            n = n-1;
            bitset[n/32] |= (1<<(n%32));
        }

        // scan over the bit vector to find the first non-zero number(not exist in file)
        for(int i=0; i<bitset.length; i++){
            for(int j=0; j<32; j++){
                if ((bitset[i] & (1<<j))==0){
                    System.out.println(i*32+j);
                    return;
                }
            }
        }

    }

}
