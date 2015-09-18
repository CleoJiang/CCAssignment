package ch2;

public class Solution02 {
    public static ListNode return_ktolast(ListNode head){
        ListNode pf,pl;
        pf=head.next;
        while (pf.next!=null){
            pl=pf;
            int count=0;
            while (count<=5 && pl.next!=null){
                pl=pl.next;
                count++;
            }
            if (count==5 && pl.next==null) return pf;
            pf=pf.next;
        }
        return null;
    }


    /**
     * Created by minhuij on 9/15/15.
     */
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}




