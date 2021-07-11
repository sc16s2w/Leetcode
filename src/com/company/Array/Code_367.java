package com.company.Array;

/**
 * 给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 */
public class Code_367 {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        boolean result = false;
        long left = 0;
        long right = num;
        while(left<=right){
            long middle = (left+right)/2;
            if((long)middle*middle == num){
                result = true;
                break;
            }
            else if((long)middle*middle > num){
                right = middle -1;
            }
            else{
                left = middle+1;
            }
        }
        return result;

    }
}
