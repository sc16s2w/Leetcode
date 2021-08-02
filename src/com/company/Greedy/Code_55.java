package com.company.Greedy;

public class Code_55 {
    //其实是找覆盖范围
    public boolean canJump(int[] nums) {
        int cover = nums[0];
        for(int i = 0;i<=cover;i++){
            if(cover>=nums.length-1) return true;
            cover = Math.max(nums[i]+i,cover);
        }
        return false;
    }
}
