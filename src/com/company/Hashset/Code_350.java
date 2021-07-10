package com.company.Hashset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class Code_350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> count1 = new HashMap<>();
        HashMap<Integer,Integer> count2 = new HashMap<>();
        HashSet<Integer> temp1 = new HashSet<>();
        HashSet<Integer> temp2 = new HashSet<>();
        for(int i =0;i<nums1.length;i++){
            if(count1.containsKey(nums1[i])) count1.put(nums1[i],count1.get(nums1[i])+1);
            else count1.put(nums1[i],1);
            temp1.add(nums1[i]);
        }

        for(int i =0;i<nums2.length;i++){
            if(count2.containsKey(nums2[i])) count2.put(nums2[i],count2.get(nums2[i])+1);
            else count2.put(nums2[i],1);
            if(temp1.contains(nums2[i])) temp2.add(nums2[i]);
        }
        List<Integer> result =  new ArrayList<>();
        for(int i:temp2){
            int num = Math.min(count1.get(i),count2.get(i));
            while(num!=0){
                result.add(i);
                num--;
            }
        }
        int[] result_final = new int[result.size()];
        for(int i = 0;i<result.size();i++){
            result_final[i] = result.get(i);
        }
        return result_final;
    }
    public static void main(String[] args){
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        int[] result = intersect(nums1,nums2);
        for(int i:result){
            System.out.println(i);
        }
    }
}
