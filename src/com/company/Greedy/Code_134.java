package com.company.Greedy;

public class Code_134 {
    /**
     * 在一条环路上有N个加油站，其中第i个加油站有汽油gas[i]升。
     *
     * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1个加油站需要消耗汽油cost[i]升。你从其中的一个加油站出发，开始时油箱为空。
     * 如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1
     * @param gas
     * @param cost
     * @return
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] store = new int[gas.length];
        for(int i = 0;i<gas.length;i++){
            store[i] = gas[i]-cost[i];
        }
        int result = -1;
        int sum = 0;
        int min = 0;
        for(int i = 0;i<store.length;i++){
            sum +=store[i];
            min = Math.min(min,sum);
        }
        if(sum<0) return result;
        if(min>=0) return 0;
        for(int i = gas.length-1;i>=0;i--){
            min+=store[i];
            if(min >= 0 ) return i;
        }
        return -1;
    }
}
