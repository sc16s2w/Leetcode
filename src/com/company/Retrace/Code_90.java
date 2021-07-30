package com.company.Retrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Code_90 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> store = new LinkedList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        retrace(nums,used,0);
        return result;
    }
    public void retrace(int[] nums,boolean[] used,int start){
        result.add(new ArrayList<>(store));
        if(start >= nums.length){
            return;
        }
        for(int i = start;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]&&!used[i-1]){
                continue;
            }
            store.add(nums[i]);
            used[i] = true;
            retrace(nums,used,i+1);
            store.removeLast();
            used[i]=false;
        }
    }
}
