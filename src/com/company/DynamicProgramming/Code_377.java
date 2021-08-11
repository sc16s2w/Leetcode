package com.company.DynamicProgramming;

public class Code_377 {
    public int combinationSum4(int[] nums, int target) {
        int dp[] = new int[target+1];
        dp[0] =1;
        for(int i = 0;i<dp.length;i++){
            for(int j = 0;j<nums.length;j++){
                if((i-nums[j])>=0) dp[i]+=dp[i-nums[i]];
            }
        }
        return dp[target];

    }
}
