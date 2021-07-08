package com.company.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 */
//注意矩阵行数不一致
public class Code_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        List<Integer> store = new ArrayList<>();
        if(matrix == null||matrix.length == 0||matrix[0].length == 0){
            return store;
        }
        while(left<=right&&top<=bottom){
            for(int column = left;column<=right;column++){
                store.add(matrix[top][column]);
            }
            for(int row = top+1;row<=bottom;row++){
                store.add(matrix[row][right]);
            }
            if(left<right&&top<bottom){
                for(int column = right-1;column>left;column--){
                    store.add(matrix[bottom][column]);
                }
                for(int row = bottom; row>top;row--) {
                    store.add(matrix[row][left]);
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return store;
    }

}
