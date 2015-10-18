package ch5;

/**
 * Created by apple on 10/15/15.
 */
public class Solution05 {
    // n & (n-1)==0 is used to check if n is power of 2

    // because & get 0 indicates that every digit of n and n-1 can't be 1 at the same time
    // n-1 is to turn n's rightmost 1 into 0 and all its left 0 to 1.
    // so all digits after that 1 is different between n and n-1
    // we just put all the digits left that 1 in n to be 0 so we could always get total different digits
    // through -1 action.
}
