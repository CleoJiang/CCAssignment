package ch4;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by apple on 9/23/15.
 */
public class Solution07 {
    ArrayList<GraphNode> jobSequence(ArrayList<GraphNode> jobs){
        ArrayList<GraphNode> result = new ArrayList<GraphNode>();

        while (jobs.size()!=0){
            for (int i=0; i<jobs.size(); i++) {
                GraphNode current = jobs.get(i);
                if (current.incoming.size() == 0) {
                    result.add(current);
                    for (GraphNode n : current.outgoing) {
                        n.incoming.remove(current);
                    }
                    jobs.remove(i);
                    break;
                }
            }
        }

        return result;

    }

    public class GraphNode {
        int val;
        LinkedList<GraphNode> incoming;
        LinkedList<GraphNode> outgoing;

        public GraphNode(int x){
            val=x;
        }
    };
}
