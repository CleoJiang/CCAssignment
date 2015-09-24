package ch4;

/**
 * Created by apple on 9/23/15.
 */
public class Solution08 {
    TreeNode firstAncestor(TreeNode a,TreeNode b){
        if (a==b) return null;
        while (a!=null){
            while(b!=a && b!=null){
                b=b.parent;
            }
            if (a==b) {return a;}

            a=a.parent;
        }
        return null;
    }
}
