package Blind75;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/clone-graph/description/
 * DFS on each neighbor to clone
 */

public class CloneGraph {
    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    class Solution {
        public Node cloneGraph(Node node) {
            if(node == null) return null;
            Node[] visited = new Node[101];
            
            return dfs(node, visited);
        }

        public Node dfs(Node node, Node[] visited) {
            if(visited[node.val] != null) {
                return visited[node.val];
            }
            Node newNode = new Node(node.val);
            visited[newNode.val] = newNode;
            for(Node neighbor : node.neighbors) {
                newNode.neighbors.add(dfs(neighbor, visited));
            }
            return newNode;
        }
    }
}