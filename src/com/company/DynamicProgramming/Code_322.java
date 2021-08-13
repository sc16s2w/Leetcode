package com.company.DynamicProgramming;

public class Code_322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for(int i = 0;i<dp.length;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i = 0;i<coins.length;i++){
            for(int j = coins[i];j<dp.length;j++){
                if(dp[j-coins[i]]!=Integer.MAX_VALUE){
                    dp[j]= Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        if(dp[amount] == 0) return -1;
        return dp[amount];
    }
}
