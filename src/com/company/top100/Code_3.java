package com.company.top100;

import java.util.HashSet;
import java.util.Set;

public class Code_3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1) return 1;
        Set<Character> store = new HashSet<>();
        int result = 0;
        int sum = 0;
        for(int i =0;i<s.length()-1;i++){
            // System.out.println(result);
            store.add(s.charAt(i));
            sum=1;
            result = Math.max(sum,result);
            for(int j = i+1;j<s.length();j++){
                if(store.contains(s.charAt(j))){
                    store = new HashSet<>();
                    sum = 0;
                    break;
                }
                else{
                    store.add(s.charAt(j));
                    sum++;
                    result = Math.max(sum,result);
                }
            }
        }
        return result;
    }
}
