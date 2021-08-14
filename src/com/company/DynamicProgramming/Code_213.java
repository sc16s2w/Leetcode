package com.company.DynamicProgramming;

public class Code_213 {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        int[] dp_start = new int[nums.length-1];
        int[] dp_end = new int[nums.length-1];
        dp_start[0] = nums[0];
        dp_start[1] = Math.max(nums[0],nums[1]);
        dp_end[0] = nums[1];
        dp_end[1] = Math.max(nums[1],nums[2]);
        for(int i=2;i<nums.length-1;i++){
            dp_start[i] = Math.max(dp_start[i-2]+nums[i],dp_start[i-1]);
        }
        for(int i = 3;i<nums.length;i++){
            dp_end[i-1]=Math.max(dp_end[i-3]+nums[i],dp_end[i-2]);
        }
        return Math.max(dp_start[nums.length-2],dp_end[nums.length-2]);
    }
}
