package com.company.top100;

import java.util.HashMap;
import java.util.Map;

public class Code_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> store = new HashMap<>();
        int[] result = new int[2];
        for(int i =0;i<nums.length;i++){
            if(store.containsKey(target-nums[i])){
                result[0] = store.get(target-nums[i]);
                result[1] = i;
                break;
            }
            else{ store.put(target-nums[i],i);

            }
        }
        return result;

    }
}
