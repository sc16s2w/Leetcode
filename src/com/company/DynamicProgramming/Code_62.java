package com.company.DynamicProgramming;

public class Code_62 {
    /**
     * 一个机器人位于一个 m x n网格的左上角 （起始点在下图中标记为 “Start” ）。
     *  机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
     *  问总共有多少条不同的路径？
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0;i<n;i++){
            dp[0][n] = 1;
        }
        for(int i = 0;i<m;i++){
            dp[i][0] =1;
        }
        for(int i = 1;i<m;i++){
            for(int j = 1; i<n;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }

        }
        return dp[m-1][n-1];
    }
}
