package ch2;


/**
 * Created by minhuij on 9/15/15.
 */
public class Solution06 {

    public static boolean is_palindrome(ListNode head){
        ListNode slow,quick;
        slow = quick =head;

        /*find the middle and the last position*/
        while(quick.next!=null) {
            slow=slow.next;
            quick=quick.next.next;
        }
        /*reverse the latter part of the linkedlist*/
        ListNode pre,p,nxt;
        pre = slow;
        p = pre.next;
        while (p.next!=null){
            nxt = p.next;
            p.next=pre;
            pre = p;
            p = nxt;
        }
        /*check character from both sides to the middle node*/
        ListNode left,right;
        left = head.next;
        right = quick;
        while(true){
            if(left.val!=right.val) return false;
            if (left==slow) break;
            left=left.next;
            right=right.next;
        }
        return true;


    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
