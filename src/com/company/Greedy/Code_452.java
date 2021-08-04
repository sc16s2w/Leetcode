package com.company.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Code_452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {

                return Integer.compare(ints[0], t1[0]);
            }
        });
       int count = 1;
        for(int i = 1;i<points.length;i++){
            if(points[i][0]>points[i-1][1]){
               count++;
            }
            else{
                points[i][1] = Math.min(points[i][1],points[i - 1][1]);

            }
        }
        return count;
    }
}
