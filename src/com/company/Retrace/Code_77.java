package com.company.Retrace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Code_77 {
    /**
     * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
     */
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        retry(n,1,k);
        return result;
    }

    public void retry(int n,int start,int k){
        if(path.size()==k){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = start;i<=n-(k- path.size())+1;i++){
            path.add(i);
            retry(n,i+1,k);
            path.removeLast();
        }
    }
}
