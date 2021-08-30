package com.company.work;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bole {
    public static int[][] UpdateMatrix (int[][] matrix) {
        int[][] index = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        // write code here
        int[][] output = new int[matrix.length][matrix[0].length];
        boolean[][] judge = new boolean[matrix.length][matrix[0].length];
        Queue<int[]> temp = new LinkedList<>();
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    temp.add(new int[]{i,j});
                    judge[j][j] = true;
                }
            }
        }
        while(!temp.isEmpty()){
            int[] now = temp.poll();
            int i = now[0];
            int j = now[1];
            for(int m = 0;m<4;m++){
                int mi = i +index[m][0];
                int mj = j +index[m][1];
                if (mi >= 0 && mi < matrix.length&& mj >= 0 && mj < matrix[0].length && !judge[mi][mj]) {
                    output[mi][mj] = output[i][j] + 1;
                    temp.offer(new int[]{mi, mj});
                    judge[mi][mj] = true;
                }
            }
        }
        return output;
        }
    public static int dfs(int[][] matrix, int i, int j,int step){
        if(i>= matrix.length||j>=matrix[0].length||i<0||j<0){
            return step;
        }
        if(matrix[i][j]==0){
            return step;
        }
        matrix[i][j] = 2;
        int a = dfs(matrix,i-1,j,step+1);
        int b = dfs(matrix,i+1,j,step+1);
        int c = dfs(matrix,i,j-1,step+1);
        int d = dfs(matrix,i,j+1,step+1);
        return Math.min(a,Math.min(b,Math.min(c,d)));
    }
    static int  result = 0;
    public static int queens (int n) {
        // write code here
        char[][] queen = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                queen[i][j] ='.';
            }
        }
        retrace(queen,0,n);
        return result;
    }
    public static boolean isValid(char[][] queen,int row,int col, int n){
        for(int i =0;i<n;i++){
            if(queen[i][col]=='q'){
                return false;
            }
        }
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(queen[i][col]=='q'){
                return false;
            }
        }
        for (int i=row-1, j=col+1; i>=0 && j<=n-1; i--, j++) {
            if(queen[i][col]=='q'){
                return false;
            }
        }
        return true;

    }
    public static void retrace(char[][] queen,int row,int n){
        if(row == n){
            result = result+1;
        }
        for(int col = 0;col<n;col++){
            if(isValid(queen,row,col,n)){
                queen[row][col]='q';
                retrace(queen,row+1,n);
                queen[row][col] = '.';
            }
        }

    }
    public static void main(String[] args){
        System.out.println(queens(4));
    }

}
