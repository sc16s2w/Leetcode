package com.company.Array;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 */
// 区间问题
public class Code_704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int result = -1;
        if(nums.length == 1&&nums[0] == target)
            return 0;
        while(left<=right){
            int middle = (left+right)/2;
            if(nums[middle]<target){
                left = middle+1;
            }
            else if(nums[middle] > target)
                right = middle-1;
            else{
                result = middle;
                break;
            }
        }
        return result;
    }
}
