package com.company.Greedy;

public class Code_53 {
    /**
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return nums[0];
        int sum = 0;
        int result = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++) {
            sum += nums[i];
            result = Math.max(sum,result);
            if (sum < 0) sum = 0;
        }
        return result;
    }

}
