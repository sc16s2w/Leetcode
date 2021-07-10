package com.company.Hashset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 */

//学到的东西 hashmap getordefault,以及对字符的操作。
public class Code_49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> store = new HashMap<>();
        for(String str:strs){
            int record[] = new int[26];
            char ch[] = str.toCharArray();
            for(int i = 0;i<str.length();i++){
                record[ch[i]-'a']++;
            }
            String key = "";
            for(int i = 0;i<record.length;i++){
                if(record[i]!=0){
                    key += String.valueOf((char) ('a' + i))+String.valueOf(record[i]);
                }
            }
            System.out.println(key);
            List<String> values = store.getOrDefault(key,new ArrayList<String>());
            values.add(str);
            store.put(key,values);
        }
        return new ArrayList<List<String>>(store.values());

    }
    public static void main(String[] args){
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> hh = groupAnagrams(strs);
        for(List h:hh){
            System.out.println(h.toString());

        }


    }
}
