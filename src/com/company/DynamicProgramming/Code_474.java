package com.company.DynamicProgramming;

public class Code_474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(String str:strs){
            int zeronum = 0;
            int onenum = 0;
            char[] ch = str.toCharArray();
            for(int i = 0;i<ch.length;i++){
                if(ch[i] == '0') zeronum++;
                else onenum++;
            }
            for(int i = m;i>=zeronum;i--){
                for (int j = n;j>=onenum;j--){
                    dp[i][j] = Math.max(dp[i][j],dp[i-zeronum][j-onenum]+1);
                }
            }
        }
        return dp[m][n];
    }
}
