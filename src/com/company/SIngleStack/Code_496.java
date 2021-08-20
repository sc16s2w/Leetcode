package com.company.SIngleStack;

import java.util.HashMap;
import java.util.Stack;

public class Code_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> store = new HashMap<>();
        Stack<Integer> temp = new Stack<>();
        temp.add(nums2[0]);
        for(int i = 1;i<nums2.length;i++){
            if(nums2[i]<=temp.peek()){
                temp.add(nums2[i]);
            }
            else{
                while(nums2[i]>=temp.peek()&&!temp.isEmpty()){
                    store.put(temp.peek(),i);
                    temp.pop();
                }
                temp.add(nums2[i]);
            }
            if(i==nums2.length-1){
                while(!temp.isEmpty()){
                    store.put(temp.pop(),-1);
                }
            }
        }
        int[] result = new int[nums1.length];
        for(int i =0;i<nums1.length;i++){
            result[i]=store.get(nums1[i]);
        }
        return result;
    }
}
