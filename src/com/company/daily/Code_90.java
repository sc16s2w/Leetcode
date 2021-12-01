package com.company.daily;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Code_90 {
    List<List<Integer>> result = new LinkedList<>();
    LinkedList<Integer> store = new LinkedList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        retrace(0,nums,used);
        return result;
    }
    public void retrace(int start, int[] nums,boolean[] used){
        if(start>=nums.length){
            return;
        }
        result.add(new LinkedList<>(store));
        for(int i = start;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]&&!used[i-1]) continue;
            store.add(nums[i]);
            used[i] = true;
            retrace(i+1,nums,used);
            used[i] = false;
            store.removeLast();
        }
    }
}
