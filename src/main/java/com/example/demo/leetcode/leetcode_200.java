package com.example.demo.leetcode;

import java.util.Queue;

public class leetcode_200 {
    class Solution {
        Integer result = 0;
        public int numIslands(char[][] grid) {
            for (int i =0 ; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1'){
                        result++;
                        dfs(grid, i, j);
                    }
                }
            }
            return result;
        }

        public void dfs(char[][] grid, int x, int y) {
            if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length)
                return;
            if (grid[x][y] == '0')
                return;

            if (grid[x][y] == '1')
                grid[x][y] = '0';

            dfs(grid, x+1, y);
            dfs(grid, x, y+1);
            dfs(grid, x-1, y);
            dfs(grid, x, y-1);
        }
    }

}
