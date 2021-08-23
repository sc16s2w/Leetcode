package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args){
        int[] input = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(input).toString());

    }
    public static List<String> splitString(List<String> list){
        List<String> result = new ArrayList<>();
        for(String s: list){
            int i = 0;
            int length = s.length();
            System.out.println(length%8);
            while(length/8!=0) {
                result.add(s.substring(i, i + 8));
                length = length - 8;
                i = i + 8;
            }
            if(length>0){
                StringBuilder sb = new  StringBuilder();
                sb.append(s.substring(s.length()-length,s.length()));
                while(length<8){
                    sb.append("0");
                    length++;
                }
                result.add(sb.toString());
            }

        }
        return result;

    }
    public static ArrayList<Integer> maxSubArray(int[] nums) {
        int sum = 0;
        int result = nums[0];
        HashMap<Integer,ArrayList<Integer>> store = new HashMap<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            sum +=nums[i];
            temp.add(nums[i]);
            if(sum>result){
                result = Math.max(result,sum);
                if(!store.containsKey(result)) store.put(result,new ArrayList<>(temp));
            }
            if(sum<0){
                sum = 0;
                temp = new ArrayList<>();
            }
        }
        System.out.println(store.get(result).toString());
        return store.get(result);

    }
}
