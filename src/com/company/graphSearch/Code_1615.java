package com.company.graphSearch;

public class Code_1615 {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[][] matrix = new int[n][n];
        int[] degree = new int[n];
        for(int[] r:roads){
            matrix[r[0]][r[1]]++;
            matrix[r[1]][r[0]]++;
            degree[r[0]]++;
            degree[r[1]]++;
        }
        int result = 0;
        for(int i =0;i<matrix.length-1;i++){
            for(int j = i+1;j<matrix.length;j++){
                int temp = degree[i]+degree[j]-matrix[i][j];
                result = Math.max(result,temp);
            }
        }
        return result;
    }
}
