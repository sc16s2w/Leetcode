package com.company.Array;

public class Code_1295 {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(int i =0;i<nums.length;i++){
            if(countDigit(nums[i])) result++;
        }
        return result;

    }
    public boolean countDigit(int num){
        boolean result = false;
        int count = 0;
        while(num!=0){
            count++;
            num = num/10;
        }
        if(count%2==0) return true;
        return result;
    }
}
