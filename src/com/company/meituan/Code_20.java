package com.company.meituan;

import java.util.*;

public class Code_20 {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> store = new Stack<>();
        Map<String,String> hh = new HashMap<>();
        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(hh.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> stringStringEntry, Map.Entry<String, String> t1) {
                return stringStringEntry.getValue().compareTo(t1.getValue());
            }
        });

        for(int i =0;i<ch.length;i++){
            if(ch[i]=='(') store.push(')');
            else if(ch[i]=='{') store.push('}');
            else if(ch[i]=='[') store.push(']');
            else{
                if(store.isEmpty()) return false;
                char c = store.pop();
                if(c!=ch[i]) return false;
            }
        }
        if(!store.isEmpty()) return false;
        return true;


    }
    //如果关闭顺序不做要求，只要求括号数量相等
}
