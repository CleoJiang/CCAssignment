package ch2;

public class Solution02 {
    public static ListNode return_ktolast(ListNode N,int k){
        ListNode pkth,ptail;
        pkth=ptail=N;

        int count=1;
        while(true){
            if(ptail.next==null) return null;
            if(count>=k) break;
            count++;
            ptail=ptail.next;
        }
        while(true){
            if (ptail.next==null) break;
            pkth=pkth.next;
            ptail=ptail.next;
        }
        return pkth;
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




