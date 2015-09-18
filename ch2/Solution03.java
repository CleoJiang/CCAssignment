package ch2;

/**
 * Created by minhuij on 9/15/15.
 */
public class Solution03 {
    public static void delete_middle(ListNode N){
        if (N.next!=null){
            N.val=N.next.val;
            N.next = N.next.next;

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
