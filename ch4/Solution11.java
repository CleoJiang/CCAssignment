//package ch4;
//
//import java.util.Random;
//
///**
// * Created by apple on 9/24/15.
// */
//public class Solution11 {
//
//
//
//    class tree{
//        TreeNode root=null;
//
//
//        public TreeNode getRandomNode(){
//            if (root==null) return null;
//            Random random = new Random();
//            int i = random.nextInt();
//            return root.getNode(i);
//        }
//
//
//
//        public class treeNode{
//            int val;
//            int size;
//            TreeNode left;
//            TreeNode right;
//            TreeNode parent;
//            public treeNode(int x){
//                this.val=x;
//            }
//
//            public int size(){
//                return (root==null)?0:root.size;
//
//            }
//            public treeNode getNode(int i){
//                int leftSize;
//                if (left==null) leftSize=0;
//                else leftSize=left.size;
//
//                if (i<leftSize) return this.left.getNode(i);
//                else if (i==leftSize) return this;
//                else return right.getNode(i-(leftSize+1));
//            }
//
//
//        };
//    };
//
//
//
//}
