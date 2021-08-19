package com.company.DynamicProgramming;

import java.util.Stack;

public class Code_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++){
            for(int j =i+1;j<temperatures.length;j++){
                if(temperatures[j]>temperatures[i]){
                    result[i]=j-i;
                    break;
                }
            }
        }
        return result;
    }
    //单调栈做法
    public int[] dailyTemperatures_2nd(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> store = new Stack<>();
        store.add(0);
        for(int i = 1;i<temperatures.length;i++){
            if(temperatures[i]<=temperatures[store.peek()]){
                store.add(temperatures[i]);
            }
            else{
                while(!store.isEmpty()&&temperatures[i]>temperatures[store.peek()]){
                    result[store.peek()] = i-store.peek();
                    store.pop();
                }
                store.add(temperatures[i]);
            }
        }
        return result;
    }
}
