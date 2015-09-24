package ch4;



/**
 * Created by apple on 9/23/15.
 */
public class Solution04 {
    public boolean isBalance(TreeNode root){
        if(root==null) return true;
        int heightDis = getHeight(root.left)-getHeight(root.right);
        if(Math.abs(heightDis)>1){
            return false;
        }else{
            return ( isBalance(root.left) && isBalance(root.right) );
        }
    }

    public int getHeight(TreeNode root){
        if(root==null) return 0;
        else return Math.max(getHeight(root.left),getHeight(root.right));
    }


}
