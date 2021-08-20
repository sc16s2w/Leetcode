package com.company.HuaWei;

import java.util.ArrayList;

public class Code_8_07 {
    ArrayList<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    public String[] permutation(String S) {
        boolean[] used = new boolean[S.length()];
        retrace(S,0,used);
        String[] finalResult = new String[result.size()];
        for(int i =0;i<result.size();i++){
            finalResult[i] = result.get(i);
        }
        return finalResult;

    }
    public void retrace(String s,int start, boolean[] used){
        if(sb.length()==s.length()){
            result.add(sb.toString());
            return;
        }
        for(int i = start;i<s.length();i++){
            if(used[i]){
                continue;
            }
            if(i>0&&s.charAt(i)==s.charAt(i-1)&&!used[i]){
                continue;
            }
            else{
                sb.append(s.charAt(i));
                used[i] = true;
                retrace(s,start,used);
                sb.deleteCharAt(sb.length()-1);
                used[i] = false;
            }
        }
    }
}
