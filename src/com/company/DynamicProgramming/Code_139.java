package com.company.DynamicProgramming;

import java.util.List;

public class Code_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()+1];
        dp[0] =true;
        for(int i = 1;i<dp.length;i++){
            for(int j = 0;j<i;j++){
                if(wordDict.contains(s.substring(j,i))&&dp[j]){
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];


    }
}
