package com.company.IslandProblem;

public class Code_200 {
    public int numIslands(char[][] grid) {
        int numOfIslands = 0;
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    numOfIslands++;
                    dfs(grid,i,j);
                }
            }
        }
        return numOfIslands;
    }
    public void dfs(char[][] grid,int i,int j){
        if(i>=grid.length||j>= grid[0].length||i<0||j<0){
            return;
        }
        if(grid[i][j]!='1'){
            return;
        }
        grid[i][j]='0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}
