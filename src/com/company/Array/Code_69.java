package com.company.Array;

/**
 * 实现int sqrt(int x)函数。
 * 计算并返回x的平方根，其中x是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */
//可以使用二分法来找是不是平方根
public class Code_69 {
    public int mySqrt(int x) {
        int left = 0;
        int ans = -1;
        int right = x;
        while(left<=right){
            int middle = (left+right)/2;
            if((long)middle*middle<=x){
                ans = middle;
                left = middle+1;
            }
            else{
                right = middle -1;
            }

        }
        return ans;

        }
}
