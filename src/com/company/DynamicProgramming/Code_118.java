package com.company.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Code_118 {
    /**
     * 杨辉三角
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        result.add(temp);
        temp = new ArrayList<>();
        temp.add(1);
        temp.add(1);
        result.add(temp);
        for(int i = 2;i<numRows;i++){
            List<Integer> store = result.get(i-1);
            temp = new ArrayList<>();
            temp.add(1);
            for(int j = 1;j<i;j++){
                temp.add(store.get(j-1)+store.get(j));
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}
