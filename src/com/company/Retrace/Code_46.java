package com.company.Retrace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Code_46 {
    /**
     * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
     * @param nums
     * @return
     */
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        retrace(nums,used,0);
        return result;
    }
    public void retrace(int[] nums, boolean[] used,int start){
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start;i<nums.length;i++){
            if(!used[i]){
                used[i] = true;
                temp.add(nums[i]);
                retrace(nums,used,start);
                used[i] = false;
                temp.removeLast();
            }
            else{
                continue;
            }
        }
    }
}
