package ch4;

/**
 * Created by apple on 9/23/15.
 */
public class Solution02 {
    public TreeNode constructMinimumBST(int[] array){
        return constructMinimumBST(array, 0, array.length-1 );
    }
    public TreeNode constructMinimumBST(int[] array,int begin,int end){
        if(begin==end) return null;
        int mid = (begin+end)/2;
        TreeNode N = new TreeNode(array[mid]);
        N.left =constructMinimumBST(array, begin, mid+1);
        N.right=constructMinimumBST(array, mid+1, end);
        return N;
    }




}
