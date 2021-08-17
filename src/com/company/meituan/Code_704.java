package com.company.meituan;

public class Code_704 {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            int middle = (j+i)/2;
            if(nums[middle]==target) return middle;
            else if(nums[middle]>target){
                j=middle-1;
            }
            else{
                i=middle+1;
            }
        }
        return -1;
    }
}
