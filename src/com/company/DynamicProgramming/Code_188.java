package com.company.DynamicProgramming;

public class Code_188 {
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0) return 0;
        int[][] dp = new int[prices.length][2*k+1];
        for(int n = 1;n<2*k+1;n++){
            if(n%2!=0) dp[0][n] = -prices[0];
        }
        for(int i = 1;i<prices.length;i++){
            for(int j = 1;j<2*k+1;j++){
                if(j%2!=0) dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-1]-prices[i]);
                else dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-1]+prices[i]);
            }
        }
        return dp[prices.length-1][2*k];
    }
}
