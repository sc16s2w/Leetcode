package com.company.Hashset;

import java.util.HashSet;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 *
 * 「快乐数」定义为：
 *
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果 可以变为  1，那么这个数就是快乐数。
 * 如果 n 是快乐数就返回 true ；不是，则返回 false 。
 */
//注意无限循环会变进hashset,以及int如何变成一位一位的。
public class Code_202 {
    public boolean isHappy(int n) {
        HashSet<Integer> store = new HashSet<>();
        while(n!=1&&!store.contains(n)){
            store.add(n);
            n = getsum(n);
        }
        return n==1;
    }
    public int getsum(int n){
        int sum = 0;
        while(n>0){
            int temp = n%10;
            sum += temp*temp;
            n/=10;
        }
        return sum;
    }
}
