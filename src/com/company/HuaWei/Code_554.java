package com.company.HuaWei;

import java.util.*;

public class Code_554 {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> store = new HashMap<>();
        for(List<Integer> width:wall){
            int temp = 0;
            for(int i = 0;i<width.size()-1;i++){
                temp+= width.get(i);
                if(store.containsKey(temp)) store.put(temp,store.get(temp)+1);
                else store.put(temp,1);
            }
        }
        List<Map.Entry<Integer,Integer>> set = new ArrayList<Map.Entry<Integer,Integer>>(store.entrySet());
        Collections.sort(set, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> integerIntegerEntry, Map.Entry<Integer, Integer> t1) {
                return t1.getValue()-integerIntegerEntry.getValue();
            }
        });
        if(set.size()<1) return wall.size();
        int result = wall.size()-set.get(0).getValue();
        return result;
    }
}
