package Practice.Blind75;

/*
 * https://leetcode.com/problems/number-of-islands/description/
 * Solve with DFS/BFS
 */

 // DFS
public class NumberIslands {
    public int numIslandsDFS(char[][] grid) {
        int count = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    markIslands(grid, i, j);
                } 
            }
        }
        return count;
    }

    public void markIslands(char[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        markIslands(grid, i + 1, j);
        markIslands(grid, i - 1, j);
        markIslands(grid, i, j + 1);
        markIslands(grid, i, j - 1);
    }

    // BFS
    // public int numIslandsBFS(char[][] grid) {
    //     int m = grid.size(), n = m ? grid[0].size() : 0, islands = 0, offsets[] = {0, 1, 0, -1, 0};
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (grid[i][j] == '1') {
    //                 islands++;
    //                 grid[i][j] = '0';
    //                 queue<pair<int, int>> todo;
    //                 todo.push({i, j});
    //                 while (!todo.empty()) {
    //                     pair<int, int> p = todo.front();
    //                     todo.pop();
    //                     for (int k = 0; k < 4; k++) {
    //                         int r = p.first + offsets[k], c = p.second + offsets[k + 1];
    //                         if (r >= 0 && r < m && c >= 0 && c < n && grid[r][c] == '1') {
    //                             grid[r][c] = '0';
    //                             todo.push({r, c});
    //                         }
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     return islands;
    // }
}

