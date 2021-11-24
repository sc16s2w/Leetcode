package com.company.top100;

import java.util.Stack;

public class Code_20 {
    public boolean isValid(String s) {
        Stack<Character> store = new Stack<>();
        char[] ch = s.toCharArray();
        for(Character c:ch){
            if(c=='(') store.add(')');
            else if(c=='[') store.add(']');
            else if(c=='{') store.add('}');
            else{
                if(store.isEmpty()) return false;
                if(store.peek()==c) store.pop();
                else return false;
            }
        }
        if(!store.isEmpty()) return false;
        return true;
    }
}
