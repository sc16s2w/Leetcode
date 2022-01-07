package com.company.top100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Code_46 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> store = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        retrace(nums,used);
        return result;
    }
    void retrace(int[] nums,boolean[] used){
        if(store.size()==nums.length){
            result.add(new ArrayList<>(store));
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(used[i]) continue;
            store.add(nums[i]);
            used[i] = true;
            retrace(nums,used);
            used[i] = false;
            store.removeLast();
        }
    }
}
