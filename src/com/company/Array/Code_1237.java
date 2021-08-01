package com.company.Array;

import java.util.*;

public class Code_1237 {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,Integer> store = new HashMap<>();
        for(int i = 0;i<mat.length;i++){
            int count = 0;
            for(int j = 0;j<mat[i].length;j++){
                if(mat[i][j]==1) count++;
            }
            store.put(i,count);
        }
        List<Map.Entry<Integer,Integer>> temp = new ArrayList<Map.Entry<Integer,Integer>>(store.entrySet());
        Collections.sort(temp, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> integerIntegerEntry, Map.Entry<Integer, Integer> t1) {
                return t1.getValue()-integerIntegerEntry.getValue();
            }
        });
        int[] result = new int[k];
        int i = 0;
        for(Map.Entry<Integer,Integer> l:temp){
            if(i==k) break;
            result[i] = l.getKey();
            i++;
        }
        return result;

    }
}
