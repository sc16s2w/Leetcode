package com.company.bytedance;

import java.util.PriorityQueue;

public class Code_215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> store = new PriorityQueue<>(k);
        for(int i =0;i<nums.length;i++){
            if(store.size()<k){
                store.add(nums[i]);
            }else if(store.peek()<nums[i]){
                store.poll();
                store.add(nums[i]);
            }
        }
        return store.peek();
    }
}
