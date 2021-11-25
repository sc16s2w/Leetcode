package com.company.daily;

public class Code_53 {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(sum<0){
                sum = 0;
            }
            sum+=nums[i];
            result = Math.max(sum,result);
        }
        return result;
    }
}
