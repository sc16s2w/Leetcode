package com.company.Greedy;

import java.util.List;

public class Code_121 {
    public int maxProfit(int[] prices) {
        int buy = prices[0] ;
        int profit = 0;
        for(int i = 1;i<prices.length;i++){
            buy = Math.min(buy,prices[i-1]);
            profit = Math.max(prices[i]-buy,profit);
        }
        return profit;
    }
}
