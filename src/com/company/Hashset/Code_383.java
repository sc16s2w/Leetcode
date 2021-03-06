package com.company.Hashset;

/**
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。
 * 如果可以构成，返回 true ；否则返回 false。
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。杂志字符串中的每个字符只能在赎金信字符串中使用一次。)
 */
public class Code_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] record = new int[26];
        char[] ch1 = ransomNote.toCharArray();
        char[] ch2 = magazine.toCharArray();
        for(int i=0;i<ch2.length;i++){
            record[ch2[i]-'a']++;
        }
        for (int i = 0;i<ch1.length;i++){
            record[ch1[i]-'a']--;
        }
        for(int i = 0;i<record.length;i++){
            if(record[i]<0) return false;
        }
        return true;
    }
}
