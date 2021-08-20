package com.company.SIngleStack;

import java.util.Arrays;
import java.util.Stack;

public class Code_503 {
    public static int[] nextGreaterElements(int[] nums) {
        int j = 0;
        Stack<Integer> store = new Stack<>();
        store.add(0);
        int[] result = new int[nums.length];
        Arrays.fill(result,-1);
        int i =1;
        while(j<2){
            for(;i<nums.length;i++){
                if(nums[i]<=nums[store.peek()]){
                    store.add(i);
                }
                else{
                    while(!store.isEmpty()&&nums[i]>nums[store.peek()]){
                        result[store.peek()] = nums[i];
                        store.pop();
                    }
                    store.push(i);
                }
            }
            j++;
            i=0;
        }
        return result;
    }
    public static void main(String[] args){
        int[] result = nextGreaterElements(new int[]{1,2,1});
        for(int i = 0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
