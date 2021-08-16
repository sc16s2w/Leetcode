package com.company.DynamicProgramming;

import java.util.Arrays;

public class Code_674 {
    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i = 1;i<nums.length;i++){
           if(nums[i-1]<nums[i]) dp[i] = dp[i-1]+1;
        }
        int result = 0;
        for(int i = 0;i<dp.length;i++){
            if(result<dp[i]) result = dp[i];
        }
        return result;
    }

}
