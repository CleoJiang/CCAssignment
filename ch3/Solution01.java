package ch3;

import java.util.EmptyStackException;

/**
 * Created by apple on 9/20/15.
 */
public class Solution01 {
    /*Three stacks are not flexible*/

        public int stackNum=3;
        public int stackCapacity;
        public int stackSize[];
        public int stackValue[];

        public Solution01(int stackLenth){
            stackCapacity=stackLenth;
            stackSize = new int[stackNum];
            stackValue= new int[stackCapacity*stackNum];
        }

        public void push(int stackNum, int value){
            if(full(stackNum)) {System.out.println("stack"+stackNum+"is full!");return;}
            stackValue[topIndex(stackNum)]=value;
            stackSize[stackNum]++;
        }
        public int pop(int stackNum){
            if(empty(stackNum)) throw new EmptyStackException();
            int value=stackValue[topIndex(stackNum)];
            stackValue[topIndex(stackNum)]=0;
            stackSize[stackNum]--;
            return value;
        }
        public int peek(int stackNum){
            if (empty(stackNum)) throw new EmptyStackException();
            return stackValue[topIndex(stackNum)];
        }
        public boolean empty(int stackNum){
            return stackSize[stackNum]==0;
        }
        public boolean full(int stackNum){
            return stackSize[stackNum]==stackCapacity;

        }
        public int topIndex(int stackNum){
            return stackNum*stackCapacity+stackSize[stackNum]-1;
        }






}

