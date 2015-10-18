package ch5;

/**
 * Created by apple on 10/15/15.
 */
public class Solution08 {
    public static void main(String[] args) {

    }
    //
    static void drawLine1(byte[] screen, int width, int x1, int x2, int y){
        int byteLength = 8;

        int x1Byte = width/8*y + x1/8;//x1 is in which byte
        int x1Shift = byteLength - x1%8-1;//x1 is in which digit of its byte(from right to left)
        int x2Byte = width/8*y + x2/8;//x1 is in which byte
        int x2Shift = byteLength - x2%8-1;//x2 is in which digit of its byte(from right to left)

        // set all inner byte between x1 and x2 to full 1 byte.
        for(int i=x1Byte+1; i<x2Byte; i++){
            screen[i]=(byte)0xFF;
        }
        // deal with the left digit in the x1byte and x2byte
        // this part could be optimized by using mask but not set the digit one by one.
        if (x1Byte==x2Byte){// if x1 and x2 are in the same byte
            for(int i = x2Shift; i<=x1Shift; i++){
                screen[x1Byte]&= (byte)(1<<i);
            }
        }else {// if x1 and x2 are in different byte
            for (int i = 0; i<=x1Shift; i++){
                screen[x1Byte]|= (byte)(1<<i);
            }
            for (int i = x2Shift; i<8; i++){
                screen[x2Byte]|= (byte)(1<<i);
            }
        }

    }
}
