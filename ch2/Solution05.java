package ch2;

/**
 * Created by minhuij on 9/15/15.
 */
public class Solution05 {

    public static ListNode sum_lists(ListNode head1, ListNode head2){
        ListNode a = head1.next;
        ListNode b = head2.next;
        ListNode dummy = new ListNode(0);
        ListNode c=dummy;
        int carry = 0;
        while(a!=null || b!=null){
            int t = (a.val+b.val+carry);
            c.next.val = t%10;
            carry = t/10;
            a=a.next;
            b=b.next;
            c=c.next;
        }
        if(carry>0) c.next.val=1;
        return dummy.next;

    }





    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
