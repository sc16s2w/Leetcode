package com.company.Retrace;

import java.util.ArrayList;
import java.util.List;

public class Code_51 {
    /**
     *  皇后问题 研究的是如何将 n个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
     * 给你一个整数 n ，返回所有不同的n皇后问题 的解决方案。
     * @param n
     * @return
     */
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] store = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                store[i][j] = '.';
            }
        }
        retrace(0,store,n);
        return result;

    }
    public void retrace(int row, char[][] store,int n){
        if(row == n){
            arrayToList(store);
            return;
        }
        for(int col = 0;col<n;col++){
            if(isValid(row,col,n,store)){
                store[row][col]='Q';
                retrace(row+1,store,n);
                store[row][col] = '.';
            }

        }
    }
    public void arrayToList(char[][] store){
        List<String> temp2 = new ArrayList<>();
        for(int i = 0;i<store.length;i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<store[i].length;j++){
                sb.append(store[i][j]);
            }
            temp2.add(sb.toString());
        }
        result.add(temp2);
    }

    public boolean isValid(int row, int col,int n, char[][] store){
        for(int i = 0;i<n;++i){
            if(store[i][col] == 'Q'){
                return false;
            }
        }
        // 检查45度对角线
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if (store[i][j] == 'Q') {
                return false;
            }
        }

        // 检查135度对角线
        for (int i=row-1, j=col+1; i>=0 && j<=n-1; i--, j++) {
            if (store[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

}
