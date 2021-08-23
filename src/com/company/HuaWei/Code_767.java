package com.company.HuaWei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Code_767 {
    StringBuilder sb = new StringBuilder();
    String result = new String();
    public String reorganizeString(String s) {
        boolean[] used = new boolean[s.length()];
        retrace(s,used,0);
        return result;
    }
    public void retrace(String s, boolean[] used,int i){
        if(i==s.length()){
            if(sb.length()==s.length()){
                result = sb.toString();
                System.out.println(result);
            }
            return;
        }
        for(int j = 0;j<s.length();j++){
            if(used[j]){
                continue;
            }
            if(sb.length()==0){
                sb.append(s.charAt(j));
                used[j] = true;
                retrace(s,used,j+1);
                used[j] = false;
                sb.deleteCharAt(sb.length()-1);
            }
            if(sb.length()>0&&s.charAt(j)!=sb.charAt(sb.length()-1)){
                sb.append(s.charAt(j));
                used[j] = true;
                retrace(s,used,j+1);
                used[j] = false;
                sb.deleteCharAt(sb.length()-1);
            }

        }

    }
}
