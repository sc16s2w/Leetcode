package com.company.daily;

public class Code_167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] res = new int[2];
        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                res[0] = left+1;
                res[1] = right+1;
                break;
            }
        }
        return res;


    }
}
