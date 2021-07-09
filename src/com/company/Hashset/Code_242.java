package com.company.Hashset;

import java.util.HashSet;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 */
public class Code_242 {
    //体现了一种对asic码的应用 大写字母的asci码比小写字母大，字母的asici码都是依次增大的
    //把第一个字符有哪些字符存进数组里一个位置代表字符串中中数组出现的字符次数。
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int[] record = new int[26];
        for(int i = 0;i<ch1.length;i++){
            record[ch1[i]-'a']++;
        }
        for(int i = 0;i<ch2.length;i++){
            record[ch2[i]-'a']++;
        }
        for(int i = 0;i<record.length;i++){
            if(record[i] != 0) return false;
        }
        return true;

    }

}
