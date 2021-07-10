package com.company.Hashset;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 */
//最开始想到的办法是暴力法，可以用hashmap做一下
public class Code_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> store = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0;i<nums.length;i++){
            int temp = target-nums[i];
            if(store.containsKey(temp)){
                result[0]= i;
                result[1] = store.get(temp);
            }
            store.put(nums[i],i);
        }
        return result;

    }
}
