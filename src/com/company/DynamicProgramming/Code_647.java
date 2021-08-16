package com.company.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Code_647 {
    static List<String> result = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    public static int countSubstrings(String s) {
        Boolean[] used = new Boolean[s.length()];
        retrace(s,0,used);
        return result.size();

    }
    public static void retrace(String s, int index, Boolean[] used){
        System.out.println("hh");
        if(index==s.length()-1){
            return;
        }
        System.out.println("hh");
        for(int i = index;i<s.length();i++){
            if(i>0&&(s.charAt(i)==s.charAt(i-1))&&(used[i-1])){
                continue;
            }
            sb.append(s, index, i);
            if(isPalindrome(sb.toString())) result.add(sb.toString());
            used[i] = true;
            retrace(s,i+1,used);
            sb.deleteCharAt(sb.length()-1);
            used[i] =false;
        }
    }
    public static boolean isPalindrome(String s){
        char[] ch = s.toCharArray();
        Stack<Character> store = new Stack<>();
        for(Character c:ch){
            store.add(c);
        }
        for(Character c:ch){
            char temp = store.pop();
            if(temp!=c) return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(countSubstrings("aaa"));
    }
}
