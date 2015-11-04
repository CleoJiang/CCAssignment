package ch4;

/**
 * Created by apple on 9/23/15.
 */
public class Solution05 {
    TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        return isMonoIncreasing(root);
    }
    private boolean isMonoIncreasing(TreeNode root){
        if (root==null) return true;
        if (isMonoIncreasing(root.left)){
            if (pre!=null && root.val<=pre.val) return false;
            pre = root;
            return isMonoIncreasing(root.right);
        }
        return false;
    }



}