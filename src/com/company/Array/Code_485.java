package com.company.Array;

public class Code_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1) count++;
            else{
                result=Math.max(count,result);
                count = 0;
            }
        }
        result = Math.max(count,result);
        return result;
    }
}
