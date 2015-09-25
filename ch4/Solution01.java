package ch4;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by apple on 9/21/15.
 */
public class Solution01 {


    HashSet<GraphNode> visited = new HashSet<GraphNode>();

    public boolean hasRoute(GraphNode a, GraphNode b){
        if (a==null) return false;
        if (a==b) return true;

        for(GraphNode n: a.adjacent()){
            if (!visited.contains(n)){
                visited.add(n);
                if (n==b) {
                    return true;
                } else{
                    return hasRoute(n,b);
                }
            }
        }
        return false;

    }





    public class GraphNode {


        int val;
        LinkedList<GraphNode> adjacent;
        public GraphNode(int x){
            val=x;
        }

        LinkedList<GraphNode> adjacent(){
            return this.adjacent;
        }


    };

}
