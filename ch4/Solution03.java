package ch4;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by apple on 9/23/15.
 */
public class Solution03 {

    ArrayList<LinkedList<TreeNode>> levelTravel(TreeNode root){
        ArrayList<LinkedList<TreeNode>> results = new ArrayList<LinkedList<TreeNode>>();
        LinkedList<TreeNode> c = new LinkedList<TreeNode>();
        if (root!=null) c.add(root);

        while(c.size()!=0){
            results.add(c);
            LinkedList<TreeNode> upperNodes = c;
            c = new LinkedList<TreeNode>();
            for (TreeNode upperNode: upperNodes){
                if (upperNode.left!=null) c.add(upperNode.left);
                if (upperNode.right!=null) c.add(upperNode.right);
            }
        }
        return results;

    }



}
