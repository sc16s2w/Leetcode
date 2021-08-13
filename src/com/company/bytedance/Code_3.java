package com.company.bytedance;

import java.util.*;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Code_3 {
    //比较笨的办法，看看会超时吗
    //记得考虑字符串为0或者字符串为1
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        char[] ch = s.toCharArray();
        List<Integer> result = new ArrayList<>();
        HashSet<Character> store = new HashSet<>();
        for(int i = 0;i<ch.length;i++){
            for(int j = i;j<ch.length;j++){
                if(store.contains(ch[j])){
                    result.add(store.size());
                    System.out.println(store.size());
                    store = new HashSet<>();
                    break;
                }
                else store.add(ch[j]);
            }
        }
        return Collections.max(result);
    }
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
