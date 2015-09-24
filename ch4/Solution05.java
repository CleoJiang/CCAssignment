package ch4;

/**
 * Created by apple on 9/23/15.
 */
public class Solution05 {
    boolean isBST(TreeNode root){
        int[] array = new int[root.size];
        makeArray(root, array);
        for (int i=0; i<array.length-2; i++){
            if (array[i]>=array[i+1]) return false;
        }
        return true;
    }
    int m=0;
    void makeArray(TreeNode root,int[] array){
        if (root==null) return;
        makeArray(root.left,array);
        array[m]=root.val;
        m++;
        makeArray(root.right,array);


    }



}