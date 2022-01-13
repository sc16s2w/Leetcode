package com.company.daily;

public class Code_977 {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int[] res = new int[nums.length];
        int i = nums.length-1;
        while(start<=end){
            if(Math.pow(nums[start],2)>Math.pow(nums[end],2)){
                res[i] = (int) Math.pow(nums[start],2);
                start++;
            }
            else{
                res[i] = (int) Math.pow(nums[end],2);
                end--;
            }
            i--;
        }
        return res;
    }
}
