package com.company.top100;

import java.util.HashSet;
import java.util.Set;

public class Code_3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> store = new HashSet<>();
        int result = 0;
        int sum = 0;
        for(int i =0;i<s.length()-1;i++){
            for(int j = i+1;j<s.length();j++){
                if(store.contains(s.charAt(j))){
                    store = new HashSet<>();
                    sum = 0;
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
