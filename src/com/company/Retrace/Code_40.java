package com.company.Retrace;

import java.util.*;

public class Code_40 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        boolean[] flag = new boolean[candidates.length];
        retrace(candidates,target,0,0,flag);
        return result;

    }

    public void retrace(int[] candidates,int target,int sum,int index,boolean[] flag){
        if(sum==target){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target) return;
        for(int i = index;i<candidates.length;i++){
            if(i>0&&candidates[i] == candidates[i-1]&&!flag[i-1]){
                continue;
            }
            flag[i] = true;
            sum = sum+candidates[i];
            temp.add(candidates[i]);
            retrace(candidates,target,sum,i+1,flag);
            sum=sum-candidates[i];
            flag[i] = false;
            temp.removeLast();
        }

    }
}
