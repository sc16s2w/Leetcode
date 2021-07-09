package com.company.Hashset;

import java.util.HashMap;
import java.util.List;

public class Code_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        map<String, S> store = new HashMap<>();
        for(String str:strs){
            int record[] = new int[26];
            char ch[] = str.toCharArray();
            for(int i = 0;i<str.length();i++){
                record[ch[i]-'a']++;
            }
            String key = "";
            for(int i = 0;i<str.length();i++){
                key += String.valueOf(ch[i])+String.valueOf(record[i]);
            }

        }


    }
}
