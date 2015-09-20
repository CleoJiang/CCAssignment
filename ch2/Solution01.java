package ch2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by minhuij on 9/13/15.
 */

public class Solution01 {

    public static ListNode remove_dups(ListNode N){
        Map<Integer,Integer> map = new HashMap();
        ListNode p = N;

        while (p.next!=null){

            if (map.containsKey(p.next.val)){
                p.next=p.next.next;
            }else{
                map.put(p.next.val,1);
            }
            p=p.next;
        }
        if(map.containsKey(p.val)) p=null;
        return N;
    }

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }

    }
}
