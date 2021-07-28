package com.company.Retrace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Code_17 {
    List<String> result = new ArrayList<>();
    StringBuffer sb = new StringBuffer();
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return result;
        }
        HashMap<Character,String[]> store = new HashMap<>();
        store.put('2',new String[]{"a","b","c"});
        store.put('3',new String[]{"d","e","f"});
        store.put('4',new String[]{"g","h","i"});
        store.put('5',new String[]{"j","k","l"});
        store.put('6',new String[]{"m","n","o"});
        store.put('7',new String[]{"p","q","r","s"});
        store.put('8',new String[]{"t","u","v"});
        store.put('9',new String[]{"w","x","y","z"});
        char[] ch = digits.toCharArray();
        retry(ch.length,store,ch,0);
        return result;
    }
    public void retry(int length,HashMap store,char[] ch,int start){
        if(sb.length()==length){
            result.add(sb.toString());
            return;
        }
        String[] str = (String[]) store.get(ch[start]);
        // for(String s:str){
        //     System.out.println(s);
        // }
        for(int i = 0;i<str.length;i++){
            sb.append(str[i]);
            // System.out.println(i);
            retry(length,store,ch,start+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
