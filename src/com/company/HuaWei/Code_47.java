package com.company.HuaWei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Code_47 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> store = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        retrace(nums,0,used);
        return result;

    }
    public void retrace(int[] nums, int start,boolean[] used){
        if(store.size()==nums.length){
            result.add(new ArrayList<>(store));
            return;
        }
        for(int i = start;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            if(i>0&&nums[i-1]==nums[i]&&!used[i-1]){
                continue;
            }
            store.add(nums[i]);
            used[i] = true;
            retrace(nums,start,used);
            used[i] = false;
            store.removeLast();
        }
    }
}
