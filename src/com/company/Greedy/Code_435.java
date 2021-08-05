package com.company.Greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
 */
public class Code_435 {
    //感觉破题的办法是找重叠的区间
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                if (ints[1] == t1[1]) {
                    return Integer.compare(t1[0], ints[0]);
                } else {
                    return Integer.compare(ints[1], t1[1]);
                }
            }
        });
        int count = 0;
        int interval = intervals[0][1];
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0]<interval){
                count++;
            }
            else{
                interval = intervals[i][1];
            }
        }
        return count;



    }
    }
