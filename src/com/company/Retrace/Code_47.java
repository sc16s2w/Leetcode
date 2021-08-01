package com.company.Retrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Code_47 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        retrace(nums,used,0);
        return result;
    }
    public void retrace(int[] nums, boolean[] used,int start){
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(used[i]||(i>0&&nums[i]==nums[i-1]&&!used[i-1])){
                continue;
            }
            used[i] = true;
            temp.add(nums[i]);
            retrace(nums,used,i+1);
            used[i] = false;
            temp.removeLast();
        }
    }
}
