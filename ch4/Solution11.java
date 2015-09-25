package ch4;

/**
 * Created by apple on 9/24/15.
 */
public class Solution11 {

    class treeNode{
        int val;
        int size;
        TreeNode left;
        TreeNode right;
        TreeNode parent;
        public treeNode(int x){
            this.val=x;
        }

        public int size();

        public treeNode getNode(int i){
            int leftSize;
            if (left==null) leftSize=0;
            else leftSize=left.size;

            if (i<leftSize) return left.getNode(i);
            else if (i==leftSize) return this;
            else return right.getNode(i-(leftSize+1));
        }
    }

    public void getRandomNode




}
