package ch2;

/**
 * Created by minhuij on 9/15/15.
 */
public class Solution04 {

    public static ListNode partition(ListNode head, int target) {
        ListNode ps,pb,pe,psh,pbh,peh,p;
        psh=pbh=peh=head;
        ps=pb=pe=head;
        psh.next=ps;pbh.next=pb;peh.next=pe;
        p = head.next;

        while (p != null) {
            if (p.val < target) {
                ps.next = p;
                ps = ps.next;
            } else if (p.val > target) {
                pb.next = p;
                pb = pb.next;
            } else {
                pe.next = p;
                pe = pe.next;
            }
            p = p.next;
        }
        ps.next=peh.next;
        pe.next=pbh.next;
        return psh.next;


    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
