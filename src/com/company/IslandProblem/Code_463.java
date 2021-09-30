package com.company.IslandProblem;

import java.util.LinkedList;
import java.util.Queue;

public class Code_463 {
    public int islandPerimeter(int[][] grid) {
        boolean[][] used = new boolean[grid.length][grid[0].length];
        Queue<int[]> store = new LinkedList<>();
        int[][] index = new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
        int result = 0;
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]==1&&!used[i][j]){
                    used[i][j] = true;
                    store.add(new int[]{i,j});
                    while(!store.isEmpty()){
                        int size = store.size();
                        while(size>0){
                            int[] temp = store.poll();
                            result+=4;
                            for(int k=0;k<4;k++){
                                int nk = temp[0]+index[k][0];
                                int mk = temp[1] +index[k][1];
                                if(nk>=0&&nk<grid.length&&mk>=0&&mk<grid[0].length&&grid[nk][mk]==1){
                                    result--;
                                    if(!used[nk][mk]){
                                        used[nk][mk] = true;
                                        store.add(new int[]{nk,mk});
                                    }
                                }
                            }
                            size--;
                        }
                    }
                }
            }
        }
        return result;
    }
}
