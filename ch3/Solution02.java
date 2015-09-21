package ch3;

import java.util.Stack;

/**
 * Created by apple on 9/21/15.
 */
public class Solution02 extends Stack<Integer> {
    Stack<Integer> min;
    public void push(int value){
        if (value > min.peek()){
            min.push(value);
        }
        else super.push(value);
    }
    public Integer pop(){
        int value=super.pop();
        if (value==min.peek()) min.pop();
        return value;
    }

}
