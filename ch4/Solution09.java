package ch4;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by apple on 9/23/15.
 */
public class Solution09{

    ArrayList<LinkedList<Integer>> BSTsequence(TreeNode N){
        ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();

        // deal with empty tree
        if (N==null){
            result.add(new LinkedList<Integer>());
            return result;
        }

        LinkedList<Integer> pre = new LinkedList<Integer>();
        pre.add(N.val);

        ArrayList<LinkedList<Integer>> left = BSTsequence(N.left);
        ArrayList<LinkedList<Integer>> right = BSTsequence(N.right);

        for(LinkedList<Integer> leftone:left){
            for(LinkedList<Integer> rightone: right){
                ArrayList<LinkedList<Integer>> weave = new ArrayList<LinkedList<Integer>>();
                weaveList(leftone,rightone,weave,pre);
                result.addAll(weave);
            }
        }

        return result;
    }

    void weaveList(LinkedList<Integer> first, LinkedList<Integer> sec,
                   ArrayList<LinkedList<Integer>> results , LinkedList<Integer> pre){
        if (first.size()==0 || sec.size()==0){
            LinkedList<Integer> result = (LinkedList<Integer>) pre.clone();
            result.addAll(first);
            result.addAll(sec);
            results.add(result);
            return;
        }

        int headfirst = first.removeFirst();
        pre.addLast(headfirst);
        pre.removeLast();
        first.addFirst(headfirst);

        int headsec = sec.removeLast();
        pre.addLast(headsec);
        weaveList(first,sec,results,pre);
        pre.removeLast();
        sec.addFirst(headsec);


    }







}
