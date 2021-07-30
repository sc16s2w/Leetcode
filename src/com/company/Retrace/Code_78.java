package com.company.Retrace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集
 */
public class Code_78 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> store = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        retrace(nums,0);
        return result;

    }
    public void retrace(int[] nums,int start){
        result.add(new ArrayList<>(store));
        if(start==(nums.length)){
            return;
        }

        for(int i = start;i<nums.length;i++){
            store.add(nums[i]);
            retrace(nums,i+1);
            store.removeLast();
        }
    }
}
