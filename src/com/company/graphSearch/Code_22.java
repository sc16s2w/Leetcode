package com.company.graphSearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Code_22 {
    StringBuilder sb = new StringBuilder();
    HashSet<String> result = new HashSet<>();
    public List<String> generateParenthesis(int n) {
        retrace(0,2*n);
        List<String> finalResult = new ArrayList<>();
        for(String s: result){
            finalResult.add(s);
        }
        return finalResult;

    }
    public void retrace(int index,int n){
        if(index == n){
            if(judge(sb.toString())){
                result.add(sb.toString());
            }
            return;
        }
        sb.append('(');
        retrace(index+1,n);
        sb.deleteCharAt(sb.length()-1);
        sb.append(')');
        retrace(index+1,n);
        sb.deleteCharAt(sb.length()-1);
    }
    public boolean judge(String sb){
        Stack<Character> store = new Stack<>();
        for(int i =0;i<sb.length();i++){
            if(sb.charAt(i)=='('){
                store.add(')');
            }
            else{
                if(store.isEmpty()) return false;
                if(store.pop()!= sb.charAt(i)){
                    return false;
                }
            }
        }
        if(!store.isEmpty()) return false;
        return true;
    }
}
