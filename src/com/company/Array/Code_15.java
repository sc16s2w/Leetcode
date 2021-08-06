package com.company.Array;

import java.util.*;

public class Code_15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,List<List<Integer>>> store = new HashMap<>();
        int i = 0;
        int j = 1;
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();
        List<List<Integer>> final_result = new ArrayList<>();
        for(i = 0,j=1;j<nums.length;j++){
            List<Integer> temp= new ArrayList<>();
            int value = nums[i]+nums[j];
            temp.add(nums[i]);
            temp.add(nums[j]);
            if(store.containsKey(value)){
                List<List<Integer>> tmp = store.get(value);
                tmp.add(temp);
            }
            else{
                List<List<Integer>> tmp = new ArrayList<>();
                tmp.add(temp);
                store.put(value,tmp);
            }
            i++;
        }
        for (i = 0;i<nums.length;i++){
            if(store.containsKey(-nums[i])){
                List<List<Integer>> get = store.get(-nums[i]);
                for(int m = 0;m<get.size();m++){
                      int length = get.get(m).size();
                      List<Integer> cur = get.get(m);
                      cur.add(nums[i]);
//                    if(!result.contains(list)) final_result.add(list);
                    result.add(cur);
                    cur.remove(length);
                }
            }
        }
        for(List<Integer> hh:result){
            for(Integer h:hh){
                System.out.print(h);
            }
        }
        return final_result;
    }
    public static void main(String[] args){
        int[] input = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> tmp = threeSum(input);
    }
}
