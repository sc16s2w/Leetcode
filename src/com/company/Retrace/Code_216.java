package com.company.Retrace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 */
public class Code_216 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        retry(k,n,0,1);
        return result;
    }
    public void retry(int k, int n,int sum,int start){
        if(sum==n||path.size()==k){
            if(sum==n&&path.size()==k) result.add(new ArrayList<>(path));
            return;
        }
        for(int i = start;i<=9-(k-path.size())+1;i++){
            path.add(i);
            sum = sum+i;
            retry(k,n,sum,i+1);
            sum = sum-i;
            path.removeLast();
        }
    }
}
