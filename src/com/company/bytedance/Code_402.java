package com.company.bytedance;

import java.util.Stack;

public class Code_402 {
    public String removeKdigits(String num, int k) {
        String[] temp = num.split("");
        int[] input= new int[temp.length];
        for(int i =0;i<temp.length;i++){
            input[i]  = Integer.parseInt(temp[i]);
        }
        Stack<Integer> store = new Stack<>();
        store.add(input[0]);
        for(int i = 1;i<input.length;i++){
            if(k==0) break;
            else{
                while(k>0&&!store.isEmpty()&&store.peek()>input[i]){
                    store.pop();
                    k--;
                }
                store.add(input[i]);
            }
        }
        String res = "";
        for(int i:store){
            res+=i+"";
        }
        return res;
    }
}
