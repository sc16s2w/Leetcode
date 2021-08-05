package com.company.Greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Code_763 {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> store = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int i = 0;i<ch.length;i++){
            if(store.containsKey(ch[i])){
                store.put(ch[i],Math.max(store.get(ch[i]),i));
            }
            else{
                store.put(ch[i],i);
            }
        }
        List<Integer> tmp = new ArrayList<>();
        int temp = store.get(ch[0]);
        for(int i = 0;i<ch.length;i++){
            temp = Math.max(temp,store.get(ch[i]));
            if(i == temp){
                tmp.add(i+1);
                temp = i;
                System.out.println(temp+" "+i);
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(tmp.get(0));
        for(int i = 1;i<tmp.size();i++){
            result.add(tmp.get(i)-tmp.get(i-1));
        }
        return result;

    }
}
