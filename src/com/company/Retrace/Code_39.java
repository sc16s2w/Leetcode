package com.company.Retrace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个无重复元素的正整数数组
 * candidates和一个正整数target，
 * 找出candidates中所有可以使数字和为目标数target的唯一组合。
 */
public class Code_39 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        retry(candidates,target,0,0);
        return result;

    }
    public void retry(int[] candidates,int target,int sum,int index){
        if(sum == target){
            if(result.contains(new ArrayList<>(temp))) return;
            result.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i = index;i<candidates.length;i++){
            sum+=candidates[i];
            temp.add(candidates[i]);
            retry(candidates,target,sum,i);
            sum-=candidates[i];
            temp.removeLast();
        }

    }

}
