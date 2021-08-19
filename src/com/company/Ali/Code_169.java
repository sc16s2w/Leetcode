package com.company.Ali;

import java.util.HashMap;

public class Code_169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> store = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(store.containsKey(nums[i])) store.put(nums[i],store.get(nums[i])+1);
            else store.put(nums[i],1);
        }
        for(int i = 0;i<nums.length;i++){
            if(store.get(nums[i])>nums.length/2) return store.get(nums[i]);
        }
        return -1;
    }
}
