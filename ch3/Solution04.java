package ch3;

import java.util.Stack;
/**
 * Created by apple on 9/21/15.
 */
public class Solution04 {
    Stack<Integer> stackQueue, stackCache;
    public Solution04(){
        stackQueue = new Stack<>();
        stackCache = new Stack<>();
    }

    public void push(int value){
        stackQueue.push(value);
    }
    public int pop(){
        if(stackCache.isEmpty()){
            while(stackQueue!=null){
                stackCache.push(stackQueue.pop());
            }
        }
        return stackQueue.pop();
    }
    public int peek(){
        if(stackCache.isEmpty()){
            while(stackQueue!=null){
                stackCache.push(stackQueue.pop());
            }
        }
        return stackQueue.peek();
    }

}
