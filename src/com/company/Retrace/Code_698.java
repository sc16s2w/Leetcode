package com.company.Retrace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Code_698 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> store = new LinkedList<>();
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
        }
        sum = sum/5;
        retrace(sum,0,nums,0);
        if(result.size() == k) return true;
        return false;
    }
    public void retrace(int sum,int start,int[] nums,int store_sum) {
        if(store_sum>sum){
            return;
        }
        if(store_sum == sum){
            result.add(store);
            return;
        }
        for(int i = start;i<nums.length;i++){
            store_sum+=nums[i];
            store.add(nums[i]);
            retrace(sum,i+1,nums,store_sum);
            store_sum-=nums[i];
            store.removeLast();
        }
    }
}
