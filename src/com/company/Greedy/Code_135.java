package com.company.Greedy;

public class Code_135 {
    //从左往右 判断一次左边孩子
    //从右往左 判断一次右边孩子，右边孩子取值按其右儿子取值+1
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        for(int i = 1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]) candy[i]= candy[i-1]+1;
        }
        for(int i = candy.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]) candy[i] = Math.max(candy[i],candy[i + 1] + 1);
        }
        int result  = 0;
        for(int i = 0;i<candy.length;i++){
            result+=candy[i];
        }
        return result+candy.length;

    }
}
