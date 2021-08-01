package com.company.Greedy;

public class Code_376 {
    //找每个区间的峰值
    public int wiggleMaxLength(int[] nums) {
        if(nums == null||nums.length<=1) return nums.length;
        int preDiff = 0;
        int curDiff = 0;
        int count = 0;
        for(int i = 1;i<nums.length;i++){
            curDiff = nums[i]-nums[i-1];
            if((curDiff>0&&preDiff<=0)||(curDiff<0&&preDiff>=0)){
                count++;
                preDiff =curDiff;
            }
        }
        return count;

    }
}
