package ch2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by minhuij on 9/13/15.
 */

public class Solution01 {

    public static ListNode remove_dups(ListNode head){
        Map<Integer,Integer> map = new HashMap();
        ListNode p = head;

        while (p.next!=null){

            if (map.containsKey(p.next.val)){
                p.next=p.next.next;
            }else{
                map.put(p.val,1);
            }
            p=p.next;
        }
        return head;
    }

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }

    }
}
