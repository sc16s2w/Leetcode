package com.company.daily;

public class Code_278 {
    public boolean isBadVersion(int n){
        if(n%2==0) return true;
        return false;
    }
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left<right){
            //int mid = left + (right - left) / 2; 以后这一行最好这样写
            int middle = (left+right)/2;
            if(isBadVersion(middle)){
                //一直到找到某个坐标是这样写
                right = middle;
            }
            else{
                left = middle+1;
            }
        }
        return left;

    }

}
