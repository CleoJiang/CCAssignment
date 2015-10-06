package ch10;



/**
 * Created by apple on 9/27/15.
 */
public class Solution08 {

    // Use a int array as a bit vector to store existence for all 32000 different Integer.

    void checkDuplicate(int[] array){
        BitSet bitSet = new BitSet(32000);

        // if this number already appeared, print it out
        // else record its existence in the bit vector
        for (int num:array){
            int numbit = num-1;
            if (bitSet.get(numbit)) System.out.println(num);
            else bitSet.set(numbit);
        }
    }

    private class BitSet{
        int[] bitset;
        BitSet(int size){
            bitset = new int[size>>5+1];
        }
        public boolean get(int index){
            int word = index >> 5;
            int bit = index & 0x1F;
            return (bitset[word] & (1<<bit))!=0;
        }
        public void set(int index){
            int word =index >> 5;
            int bit = index & 0x1F;
            bitset[word] = bitset[word] | (1<<bit);
        }

    };




}
