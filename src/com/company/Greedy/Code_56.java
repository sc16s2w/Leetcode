package com.company.Greedy;

import java.util.*;

public class Code_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                if(ints[0] == t1[0]){
                    return ints[1] -t1[1];
                }
                else{
                    return ints[0]-t1[0];
                }
            }
        });
        int[] temp = new int[2];
        temp[0] = intervals[0][0];
        temp[1] = intervals[0][1];
        List<int[]> store = new LinkedList<>();
        for (int i = 1;i<intervals.length;i++){
            // System.out.println(intervals[i][0]+"i"+intervals[i][1]);
            // System.out.println(temp[0]+" "+temp[1]);
            if(intervals[i][0]>temp[1]){
                store.add(new int[]{temp[0], temp[1]});
                temp[0] = intervals[i][0];
                temp[1] = intervals[i][1];
            }
            else{
                temp[0] = Math.min(temp[0],intervals[i][0]);
                temp[1] = Math.max(temp[1],intervals[i][1]);
            }
        }
        if(!store.contains(new int[]{temp[0], temp[1]})) store.add(new int[]{temp[0], temp[1]});
        int[][] result = new int[store.size()][2];
        for(int i = 0;i<result.length;i++){
            result[i] = store.get(i);
        }
        return result;

    }
}
