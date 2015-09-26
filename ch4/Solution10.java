package ch4;

/**
 * Created by apple on 9/23/15.
 */
public class Solution10 {
    boolean contain(TreeNode T1, TreeNode T2){
        if (T1==null) return true;
        return subtree(T1, T2);
    }

    boolean subtree(TreeNode T1, TreeNode T2){
        if (T1==null) return false;
        if(T1.val==T2.val && match(T1,T2)){
            return true;
        }else return (match(T1.left, T2) || match(T1.right, T2));
    }

    private boolean match(TreeNode t1, TreeNode t2) {
        if (t1==null && t2==null) return true;
        else if (t1==null || t2==null) return false;
        else if (t1.val!=t2.val) return false;
        else return ( match(t1.left,t2.left) && match(t1.right,t2.right) );
    }


}
