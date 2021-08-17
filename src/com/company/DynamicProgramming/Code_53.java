package com.company.DynamicProgramming;

public class Code_53 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int result = nums[0];
        for(int i = 1;i<nums.length;i++){
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
            result = Math.max(result,dp[i]);
        }
        return result;
    }
}
