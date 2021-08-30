package com.company.Retrace;

public class Code_647 {
    public int countSubstrings(String s) {
        int result = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int i = s.length()-1;i>=0;i--){
            for(int j = i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if((j-i)<=1){
                        result++;
                        dp[i][j] = true;
                    }
                    else if(i<s.length()-1&&j>0&&dp[i+1][j-1]){
                        result++;
                        dp[i][j] = true;
                    }
                }
            }
        }
        return result;

    }
}
