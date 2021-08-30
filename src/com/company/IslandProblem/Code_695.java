package com.company.IslandProblem;

public class Code_695 {
    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        for(int i =0;i< grid.length;i++){
            for(int j =0;j< grid[i].length;j++){
                if(grid[i][j]==1){
                    result = Math.max(result,dfs(grid,i,j));
                }
            }
        }
        return result;

    }
    public int dfs(int[][] grid,int i, int j){
        if(i>=grid.length||j>=grid[0].length||i<0||j<0){
            return 0;
        }
        if(grid[i][j]!=1){
            return 0;
        }
        grid[i][j] = 0;
        int a = dfs(grid,i-1,j);
        int b = dfs(grid,i+1,j);
        int c = dfs(grid,i,j-1);
        int d = dfs(grid,i,j+1);
        return 1+a+b+c+d;
    }
}
