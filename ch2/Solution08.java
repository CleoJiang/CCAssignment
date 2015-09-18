package ch2;

import java.util.HashMap;

/**
 * Created by minhuij on 9/15/15.
 */
public class Solution08 {
    public static ListNode loop_detection(ListNode head){
        if (head==null || head.next==null || head.next.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode quick=head;
        while(quick!=null && quick.next!=null){
            slow=slow.next;
            quick=quick.next.next;
            if (slow==quick) {
                break;
            }
        }
        if (quick==null || quick.next==null) return null;

        slow=head;
        while(true){
            if (slow==quick) return slow;
            slow=slow.next;
            quick=quick.next;
        }


        }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }














}
