package com.company.DynamicProgramming;

public class Code_1049 {
    //最后一块石头的重量，尽量分成相似的两堆，这样剩的重量才小
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for(int i = 0;i<stones.length;i++){
            sum+=stones[i];
        }
        int target = sum/2;
        int[] dp = new int[target+1];
        for(int i =0;i<stones.length;i++){
            for(int j = target;j>=stones[i];j--){
                dp[j] = Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return sum - 2*dp[target];
    }
}
