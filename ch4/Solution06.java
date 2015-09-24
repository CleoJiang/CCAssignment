package ch4;

/**
 * Created by apple on 9/23/15.
 */
public class Solution06 {
    TreeNode nextNode(TreeNode N){
        if (N==null) return null;

        if (N.right!=null)
            return leftMost(N.right);
        else{
            N=N.parent;
            while((N.parent!=null) && (N.parent.left==N)) {
                N=N.parent;
            }
            return N;
        }

    }

    TreeNode leftMost(TreeNode n){
        if (n==null) return null;
        while(n.left!=null) n = n.left;
        return n;

    }


}
