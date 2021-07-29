package com.company.Retrace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Code_131 {
    List<List<String>> result = new ArrayList<>();
    LinkedList<String> temp = new LinkedList<>();
    public List<List<String>> partition(String s) {
        retrace(s,0);
        return result;

    }
    public void retrace(String s,int index){
        if(index>s.length()) return;
        if(index==s.length()){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index;i<s.length();i++){
            String str = s.substring(index,i+1);
            if(isPalindrome(str)){
                temp.add(str);
            }
            else{
                continue;
            }
            retrace(s,i+1);
            temp.removeLast();
        }
    }

    public boolean isPalindrome(String s){
        char[] ch = s.toCharArray();
        int i = 0;
        int j=s.length()-1;
        while(i<=j){
            if(ch[i] != ch[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
