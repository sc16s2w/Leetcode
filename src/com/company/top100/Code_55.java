package com.company.top100;

public class Code_55 {
    public boolean canJump(int[] nums) {
        int maxDistance = 0;
        for(int i = 0;i<nums.length;i++){
            if(i>maxDistance) break;
            maxDistance = Math.max(nums[i]+i,maxDistance);
        }
        if(maxDistance<nums.length-1) return false;
        return true;
    }
}
