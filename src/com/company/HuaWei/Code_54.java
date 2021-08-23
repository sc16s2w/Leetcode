package com.company.HuaWei;

import java.util.ArrayList;
import java.util.List;

public class Code_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        while(left<=right&&top<=bottom){
            if(left==right){
                for(int i = top;i<=bottom;i++){
                    result.add(matrix[i][left]);
                }
                break;
            }
            if(top==bottom){
                for(int i =left;i<=right;i++){
                    result.add(matrix[top][i]);
                }
                break;
            }
            for(int i =left;i<right;i++){
                result.add(matrix[top][i]);
            }
            for(int i = top;i<bottom;i++){
                result.add(matrix[i][right]);
            }
            for(int i = right;i>left;i--){
                result.add(matrix[bottom][i]);
            }
            for(int i = bottom;i>top;i--){
                result.add(matrix[i][left]);
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return result;

    }
}
