package ch3;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by apple on 9/21/15.
 */
public class Solution03 {
     ArrayList<Stack> stacks = new ArrayList<Stack>();
    public void push(int value){
        Stack last = stacks.get(stacks.size() - 1);
        if (last!=null && last.size()==last.capacity()){
            last.push(value);
        }else{
            Stack<Integer> s = new Stack<Integer>;
            s.push(value);
            stacks.add(s);
        }

    }
    public int pop() throws Exception {
        Stack last = stacks.get(stacks.size()-1);
        if(last==null) throw new Exception("stack is empty");
        int value = (int) last.pop();
        if (last.size()==0) stacks.remove(stacks.size()-1);
        return value;
    }




}
