package com.company.Greedy;

public class Code_714 {
    public int maxProfit(int[] prices, int fee) {
        int buyPrice = prices[0]+fee;
        int sum = 0;
        for(int p:prices){
            if(p+fee<buyPrice){
                buyPrice = p+fee;
            }
            else if(p>buyPrice){
                sum+=p-buyPrice;
                buyPrice = p;
            }

        }
        return sum;

    }
}
