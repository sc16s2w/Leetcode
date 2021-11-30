package com.company.top100;

import java.util.LinkedList;
import java.util.List;

public class Code_763 {
    /**
     * 用贪心算法找延展
     * @param s
     * @return
     */
    public List<Integer> partitionLabels(String s) {
        char[] transfer = s.toCharArray();
        int[] store = new int[26];
        for(int i = 0;i<transfer.length;i++){
            store[transfer[i]-'a'] =i;
        }
        int anchor = 0;
        int count = 0;
        List<Integer> result = new LinkedList<>();
        for(int i = 0;i<transfer.length;i++){
            count = Math.max(count,store[transfer[i]-'a']);
            if(i == count){
                result.add(count-anchor+1);
                anchor = i+1;
            }
        }
        return result;
    }
}
