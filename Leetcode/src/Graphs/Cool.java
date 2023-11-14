package Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Cool {
    public static List<Integer> FindCool(int nodes, int[] from, int[] to) {
        ArrayList<Integer> order = new ArrayList<>();
        boolean[][] adjacencies = new boolean[nodes + 1][nodes + 1];
        for(int i = 0; i < from.length; i++) {
            adjacencies[from[i]][to[i]] = true;
            adjacencies[to[i]][from[i]] = true;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(nodes);
        boolean[] visited = new boolean[nodes + 1];
        
        while(!pq.isEmpty()) {
            int curr = pq.poll();
            order.add(curr);
            visited[curr] = true;
            for(int i = 1; i < adjacencies[curr].length; i++) {
                if(adjacencies[curr][i] && !visited[i]) {
                    pq.add(i);
                    visited[i] = true;
                }
            }           
        }
        return order;
    }

}
