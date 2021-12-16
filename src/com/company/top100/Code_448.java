package com.company.top100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Code_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] store = new int[nums.length+1];
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            store[nums[i]] = 1;
        }
        for(int i =1;i<store.length;i++){
            if(store[i]==0) result.add(i);
        }
        return result;
    }
}
