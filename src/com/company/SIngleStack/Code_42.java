package com.company.SIngleStack;

import java.util.HashSet;
import java.util.Stack;

public class Code_42 {
    //双指针法求解
    public static int trap(int[] height) {
        int result =0;
        for(int i =0;i<height.length;i++){
            if(i==0||i==height.length-1) continue;
            int lheight = 0;
            int rheight = 0;
            for(int m = i-1;m>=0;m--){
                lheight = Math.max(height[m],lheight);
            }
            for(int n=i+1;n<height.length;n++){
                rheight = Math.max(rheight,height[n]);
            }
            int temp = Math.min(lheight,rheight)-height[i];
            if(temp>=0) result+=temp;
        }
        return result;

    }
    public static void main(String[] args){
        System.out.println(trap(new int[]{4,2,0,3,2,5}));
    }
}
