package com.company.Hashset;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
 *
 * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
 */
//会超时
public class Code_438 {
    public List<Integer> findAnagrams(String s, String p) {
        int length = p.length();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i<=s.length();i++){
            String split=s.substring(i, i+length);
            if(judge(split, p)) result.add(i);
        }
        return result;

    }

    public boolean judge(String split, String p){
        int[] record = new int[26];
        for(int i = 0;i<p.length();i++){
            record[p.toCharArray()[i]-'a']++;
        }
        for(int i = 0;i<split.length();i++){
            record[split.toCharArray()[i]-'a']--;
        }
        for(int i = 0;i<record.length;i++){
            if(record[i]!=0) return false;
        }
        return true;

    }
}
