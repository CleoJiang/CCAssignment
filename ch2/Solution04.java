package ch2;

/**
 * Created by minhuij on 9/15/15.
 */
public class Solution04 {

    public static ListNode partition(ListNode head, int target) {
        ListNode pSmall, pBig, p;
        ListNode pBigHead = new ListNode(0);
        ListNode pSmallHead = new ListNode(0);

        pBig = pBigHead;
        pSmall=pSmallHead;

        p = head.next;
        while (p != null) {
            if (p.val < target) {
                pSmall.next = p;
                pSmall = pSmall.next;
            } else{
                pBig.next = p;
                pBig = pBig.next;
            }
            p = p.next;
        }
        pSmall.next = pBigHead.next;
        pBig.next=null;
        return pSmallHead.next;


    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
