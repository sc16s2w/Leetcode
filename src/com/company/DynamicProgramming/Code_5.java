package com.company.DynamicProgramming;

import java.util.Stack;

public class Code_5 {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];

        for(int i = s.length()-1;i>=0;i--){
            for(int j = i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if((j-i)<=1){
                        dp[i][j] = true;
                    }
                    else if(i<s.length()-1&&j>0&&dp[i+1][j-1]){
                        dp[i][j]=true;
                    }
                }
            }
        }
        String sb = "";
        int result = -1;
        for(int i = 0;i<s.length();i++){
            for(int j =0;j<s.length();j++){
                if(dp[i][j]){
                    if(j-i>result){
                        sb=s.substring(i,j+1);
                        result = j-i;
                    }
                }
            }
        }
        return sb;
    }
}
