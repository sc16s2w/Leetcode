package com.company.graphSearch;

public class Code_494 {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        retrace(nums,0,target,0);
        return count;

    }
    public void retrace(int[] nums, int sum,int target,int index){
        if(index==nums.length){
            if(sum==target){
                count++;
            }
            return;
        }
        retrace(nums,sum+nums[index],target,index+1);
        retrace(nums,sum-nums[index],target,index+1);

    }
}
