package com.company.DynamicProgramming;

public class Code_746 {
    public int minCostClimbingStairs(int[] cost) {
        int result = 0;
        int a = cost[0];
        int b = cost[1];
        for(int i =2;i<cost.length;i++){
            result = Math.min(a,b)+cost[i];
            a = b;
            b =result;
        }
        return Math.min(a,b);
    }
}
