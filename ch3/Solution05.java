package ch3;

import java.util.Stack;

/**
 * Created by apple on 9/21/15.
 */
public class Solution05 {
    Stack<Integer> Cache= new Stack<Integer>();


     public Stack sort_stack(Stack s){


         Stack<Integer> Cache = new Stack<>();
         //sort into Cache
         Cache.push((Integer) s.pop());
         while(!s.isEmpty()){
             int temp = (int) s.pop();
             while(!Cache.isEmpty() && temp<Cache.peek()){
                 s.push(Cache.pop());
             }
             Cache.push(temp);
         }

         while(!Cache.isEmpty()){
             s.push(Cache.pop());
         }
         return s;
     }
}
