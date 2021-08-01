package com.company.Greedy;

import java.util.Arrays;

public class Code_455 {
    //自己感觉是排序+双指针遍历
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length-1, j = s.length-1;
        int result = 0;
        while(i>=0&&j>=0){
            if(s[j]>=g[i]){
                j--;
                i--;
                result++;
            }
            else{
                i--;
            }
        }
        return result;
    }
}
