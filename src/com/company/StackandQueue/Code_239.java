package com.company.StackandQueue;

import java.util.*;

/**
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 返回滑动窗口中的最大值。
 */
public class Code_239 {
    //用传统方法是对的，但是会超出时间限制
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = k;
        while(j<nums.length){
            List<Integer> temp = new ArrayList<>();
            for(;i<j;i++){
                temp.add(nums[i]);
            }
            result.add(Collections.max(temp));
            j = j+1;
            i = j-k;
        }
        int[] result_final =new int[result.size()];
        for(int m = 0;m<result_final.length;m++){
            result_final[m] = result.get(m);
        }
        return result_final;
    }
    //一种解法就是实现单调队列，用单调队列来完成这些。
    public class Myqueue{
        Deque<Integer> store = new LinkedList<>();
        void poll(int val){
            if(!store.isEmpty()&& val == store.peek()){
                store.poll();
            }
        }

        void add(int val){
            while(!store.isEmpty()&&val>store.getLast()){
                store.removeLast();
            }
            store.addLast(val);
        }

        int peek(){
            return store.peekFirst();
        }
    }
    public int[] maxSlidingWindow_2nd(int[] nums, int k) {
        if (nums.length == 1) {
            return nums;
        }
        int[] result = new int[nums.length-k+1];
        Myqueue store = new Myqueue();
        for(int i = 0;i<k;i++){
            store.add(nums[i]);
        }
        int j = 0;
        result[j++] = store.peek();
        for(int i = k;i<nums.length;i++){
            store.poll(nums[i-k]);
            store.add(nums[i]);
            result[j++]=store.peek();
        }
        return result;
    }

}
