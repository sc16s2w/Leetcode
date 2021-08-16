package com.company.DynamicProgramming;

import java.util.Arrays;

public class Code_300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int result = 1;
        Arrays.fill(dp,1);
        for(int i = 1;i<nums.length;i++){
            for(int j = 0;j<i;j++){
                if(nums[i]>nums[j]) dp[i] = Math.max(dp[i],dp[j]+1);
            }
            if(dp[i]>result) result = dp[i];
        }
        return result;
    }
}
