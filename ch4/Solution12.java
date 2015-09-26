package ch4;

import java.util.HashMap;

/**
 * Created by apple on 9/24/15.
 */
public class Solution12 {
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    int count=0,sum=0;
    int countPath(TreeNode root, int target){
        dfs(root,sum,target);
        return count;
    }
    void dfs(TreeNode root, int sum, int target){
        if (root==null) return;
        sum+=sum+root.val;
        if(map.containsKey(sum)){
            map.put(sum,1);
        }else{
            map.put(sum,map.get(sum)+1);
        }
        if (map.containsKey(sum-target)) count++;
        dfs(root.left,sum,target);
        dfs(root.right,sum,target);
        map.put(sum,map.get(sum)-1);

    }



}
