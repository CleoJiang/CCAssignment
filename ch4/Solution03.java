package ch4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by apple on 9/23/15.
 */
public class Solution03 {

    List<List<Integer>> levelTravel(TreeNode root){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<Integer>();
            int size = queue.size();

            for(int i = 0; i < size; i++){
                TreeNode node = queue.peek();
                queue.remove();
                level.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }

            }
            result.add(level);
        }

        return result;

    }



}
