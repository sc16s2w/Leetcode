package com.company.Greedy;

public class Code_122 {
    /**
     * 给定一个数组 prices ，其中 prices[i] 是一支给定股票第 i 天的价格。
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int result = 0;
        for(int i = 1;i<prices.length;i++){
            int sum = prices[i] - prices[i-1];
            if(sum > 0) result+=sum;
        }
        return result;
     }
}
