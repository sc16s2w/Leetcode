package com.company.Retrace;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Code_22 {
    HashSet<String> result = new HashSet<>();
    StringBuilder sb = new StringBuilder();
    public List<String> generateParenthesis(int n) {
        char[] store = new char[2*n];
        for(int i = 0;i<n;i++){
            store[i] = '(';
        }
        for(int i = n;i<2*n;i++){
            store[i] = ')';
        }
        retrace(store,0);
        List<String> final_result = new ArrayList<>();
        for(String s:result) final_result.add(s);
        return final_result;
    }
    public void retrace(char[] ch,int start){
        if(sb.length() == ch.length){
            if(isValid(sb.toString()){
                result.add(sb.toString());
            }
            return;
        }
        for(int i = start;i<ch.length;i++){
            sb.append(ch[i]);
            retrace(ch,i);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public boolean isValid(String s) {
        Stack<Character> store = new Stack<>();
        char ch[] = s.toCharArray();
        for (char c : ch) {
            if (c == '(') store.add(')');
            else if (c == ')') store.add('(');
        }
        for (char c : ch) {
            char temp = store.pop();
            if (c != temp) return false;
        }
        return true;
    }

}
