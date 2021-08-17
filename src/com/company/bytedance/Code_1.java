package com.company.bytedance;

import java.util.HashMap;

public class Code_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> store = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0;i<nums.length;i++){
            if(store.containsKey(nums[i])){
                result[0] = store.get(nums[i]);
                result[1] = i;
            }
            else store.put(target-nums[i],i);
        }
        return result;
    }
}
