package ch2;

/**
 * Created by minhuij on 9/15/15.
 */
public class Solution03 {
    public static boolean delete_middle(ListNode N){
        if (N==null || N.next!=null){
            return false;
        }
        N.val=N.next.val;
        N.next=N.next.next;
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
