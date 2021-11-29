package com.company.top100;

import java.util.LinkedList;
import java.util.List;

public class Code_39 {
    List<List<Integer>> result = new LinkedList<>();
    LinkedList<Integer> store = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        retrace(0,target,candidates,0);
        return result;

    }
    public void retrace(int sum,int target,int[] candidates,int index){
        if(sum==target){
            if(result.contains(new LinkedList<>(store))) return;
            result.add(new LinkedList<>(store));
            return;
        }
        if(sum>target) return;
        for(int i = index;i<candidates.length;i++){
            sum+=candidates[i];
            store.add(candidates[i]);
            retrace(sum,target,candidates,i);
            store.removeLast();
            sum-=candidates[i];
        }
    }
}
