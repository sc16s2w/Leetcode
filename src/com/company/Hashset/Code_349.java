package com.company.Hashset;

import java.util.HashSet;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
//用hashmap算次数
public class Code_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> store1 = new HashSet<>();
        HashSet<Integer> store2 = new HashSet<>();
        for(int i = 0; i<nums1.length;i++){
            store1.add(nums1[i]);
        }
        for(int i = 0; i<nums2.length;i++){
            if(store1.contains(nums2[i])) store2.add(nums2[i]);
        }
        Object[] obj = store2.toArray();
        int[] result = new int[obj.length];
        for(int i = 0; i<obj.length;i++){
            result[i] = (int) obj[i];
        }

        return result;
    }
}
