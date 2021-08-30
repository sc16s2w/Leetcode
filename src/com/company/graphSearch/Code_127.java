package com.company.graphSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code_127 {
    int count = Integer.MAX_VALUE;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;
        Map<String,Boolean> used = new HashMap<>();
        retrace(beginWord,endWord,used,0,wordList);
        return count;
    }
    public void retrace(String beginWord,String endWord, Map<String,Boolean> used,int result,List<String> wordList){
        if(result == wordList.size()){
            if(beginWord==endWord){
                count = Math.min(result,count);
            }
            return;
        }
        for(int i = 0;i<wordList.size();i++){
            if(calculate(beginWord,wordList.get(i))&&(!used.containsKey(wordList.get(i))||!used.get(wordList.get(i)))){
                String temp = wordList.get(i);
                used.put(wordList.get(i),true);
                retrace(temp,endWord,used,result+1,wordList);
                used.put(wordList.get(i),false);
            }
        }
    }
    public boolean calculate(String beginWord, String endWord){
        int temp = 0;
        for(int i = 0;i<beginWord.length();i++){
            if(beginWord.charAt(i)!=endWord.charAt(i)){
                temp++;
            }
        }
        if(temp!=1) return false;
        return true;
    }
}
