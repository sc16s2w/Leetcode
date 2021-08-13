package com.company.DynamicProgramming;

public class Code_279 {
    public int numSquares(int n) {
        int m = (int) Math.sqrt(n)+1;
        int dp[] = new int[n+1];
        for(int i = 0;i<dp.length;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i = 0;i<m;i++){
            int temp = i*i;
            for(int j = temp;j<dp.length;j++){
                if(dp[j-temp]!= Integer.MAX_VALUE) dp[j] = Math.min(dp[j],dp[j-temp]+1);
            }
        }
        return dp[n];
    }
}
