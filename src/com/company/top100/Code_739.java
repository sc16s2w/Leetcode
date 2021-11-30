package com.company.top100;

import java.util.Stack;

public class Code_739 {
    /**
     * 单调栈
     * @param temperatures
     * @return
     */
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> store = new Stack<>();
        store.add(0);
        for(int i = 1;i<temperatures.length;i++){
            if(temperatures[i]<temperatures[store.peek()]){
                store.add(i);
            }
            else{
                while(!store.isEmpty()&&temperatures[i]>temperatures[store.peek()]){
                    result[store.peek()] = i-store.peek();
                    store.pop();
                }
                store.add(i);
            }
        }
        return result;
    }
}
