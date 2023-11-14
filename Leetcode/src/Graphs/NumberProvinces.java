package Graphs;

/*
 * https://leetcode.com/problems/number-of-provinces/description/
 * Can use DFS or Union Find
 */

public class NumberProvinces {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for(int i = 0; i < isConnected.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(isConnected, visited, i);
                count++;
            }
        }
        return count;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int i) {
        for(int j = 0; j < isConnected.length; j++) {
            if(isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(isConnected, visited, j);
            }
        }
    }
}
