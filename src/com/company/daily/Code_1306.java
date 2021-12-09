package com.company.daily;

import java.util.ArrayList;
import java.util.List;

public class Code_1306 {
    /**
     * 注意隐藏条件，是0的target可能有两个，除此之外，如果一直跳到重复的那一步的话，可能会导致死循环，所以添加一个used的数组。
     */
    boolean result = false;
    public boolean canReach(int[] arr, int start) {
        List<Integer> res = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                res.add(i);
            }
        }
        for(Integer target:res){
            boolean[] used = new boolean[arr.length];
            retrace(arr,start,target,used);
        }
        return result;
    }

    private void retrace(int[] arr, int start,int target,boolean[] used) {
        if(start<0||start>=arr.length) return;
        if(start == target) {
            result = true;
            return;
        }
        if(used[start]) return;
        used[start] = true;
        retrace(arr,start+arr[start],target,used);
        retrace(arr,start-arr[start],target,used);
    }
}
