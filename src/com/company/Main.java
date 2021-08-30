package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args){
        int[] input = new int[]{2,3,4,5};
        System.out.println(maxLength(input));

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
    public static int maxLength (int[] arr) {
        // write code here
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j =1;
        while(i<arr.length&&j<arr.length){
            System.out.println(i+" "+j);
            if(arr[i]!=arr[j]){
                if(arr[j]!=arr[j-1]){
                    j++;
                }
                else{
                    result.add(j-i-1);
                    i++;
                }
            }
            else{
                result.add(j-i);
                i++;
                j++;
            }
        }
        if(result.size()<1) return arr.length;
        return Collections.max(result);
    }
}
