package com.company.StackandQueue;

import java.security.KeyStore;
import java.util.*;
/**
 * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
 */
public class Code_347 {
    //我的办法，用map进行频率统计 然后排序
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer,Integer> store = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(store.containsKey(nums[i])) store.put(nums[i],store.get(nums[i])+1);
            else{
                store.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(store.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o2.getValue() - o1.getValue());
            }
        });
        for(Map.Entry<Integer,Integer> t:list){
            k=k-1;
            if(k>=0) result[k] = t.getKey();
            else{
                break;
            }
        }
        return result;
    }
    //用堆
    public int[] topKFrequent_2nd(int[] nums, int k) {
        Map<Integer,Integer> store = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(store.containsKey(nums[i])) store.put(nums[i],store.get(nums[i])+1);
            else{
                store.put(nums[i],1);
            }
        }
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] m, int[] n) {
                return m[1] - n[1];
            }
        });
        for (Map.Entry<Integer, Integer> entry : store.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            if (queue.size() == k) {
                if (queue.peek()[1] < count) {
                    queue.poll();
                    queue.offer(new int[]{num, count});
                }
            } else {
                queue.offer(new int[]{num, count});
            }
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; ++i) {
            ret[i] = queue.poll()[0];
        }
        return ret;
    }

}
