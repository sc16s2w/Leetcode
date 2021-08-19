package com.company.DynamicProgramming;

public class Code_392 {
    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i==s.length();
    }
    //动态规划
    public static boolean isSubsequence_2nd(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[s.length()][t.length()]==s.length();
    }
    public static void main(String[] args){
        System.out.println(isSubsequence("axc","ahbgbc"));
    }
}
