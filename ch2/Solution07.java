package ch2;

/**
 * Created by minhuij on 9/15/15.
 */
public class Solution07 {

    public static result is_intersection(ListNode head1, ListNode head2){
        ListNode a,b;
        a = head1.next;
        b = head2.next;
        result re = new result();

        /*count the sizes of the two list*/
        int sizea=0, sizeb=0;
        while (a.next!=null){
            a=a.next;
            sizea++;
        }
        while (b.next!=null){
            b=b.next;
            sizeb++;
        }

        /*find intersection*/
        a = head1.next;
        b = head2.next;
        int dis = sizea-sizeb;
        int step=0;
        if (dis>0){
            while (step<2){
                a = a.next;
                step++;
            }
            while (a!=null){
                if (a==b){
                    re.has_intersection=true;
                    re.inter_node=a;
                    return re;
                }
                re.has_intersection=false;
                re.inter_node=null;
                return re;
            }

        }else if (dis==0){
            while (a!=null){
                if (a==b){
                    re.has_intersection=true;
                    re.inter_node=a;
                    return re;
                }
                re.has_intersection=false;
                re.inter_node=null;
                return re;
            }

        }else {
            ListNode t = a;
            a = b;
            b = t;
            while (a!=null){
                if (a==b){
                    re.has_intersection=true;
                    re.inter_node=a;
                    return re;
                }
                re.has_intersection=false;
                re.inter_node=null;
                return re;
            }
        }


        return re;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    static class result {
        boolean has_intersection;
        ListNode inter_node;
        result(){
            has_intersection=false;
            inter_node=null;
        }
    }
}
