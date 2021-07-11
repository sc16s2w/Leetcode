package com.company.Hashset;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Handler;

public class Code_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int left = 0;
        int right = 1;
        if(nums.length<3) return null;
        HashMap<Integer,Integer> store = new HashMap<>();
        while(left<right){
            int sum = nums[left]+nums[right];
            if(store.containsKey(sum)) store.put(sum,store.get(sum)+1);
            else store.put(sum,1);
            if(right<nums.length) right++;
            else{
                left++;
                right = left+1;
            }
        }
        for(int i = 0)

    }
}
