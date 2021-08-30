package com.company.graphSearch;

public class Code_130 {
    //只能过60%
    public void solve(char[][] board) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                dfs(board,i,j, board.length,board[0].length,visited);
            }
        }

    }
    public void dfs(char[][] board, int i,int j, int ni,int nj,boolean[][] visited){
        if(i<0||i>=ni||j<0||j>=nj){
            return;
        }
        if(visited[i][j]) {
            return;
        }
        if(board[i][j]=='O'){
            if(i==0||i==ni-1||j==0||j==nj-1||(i==1&&board[i-1][j]=='O')||(i==ni-2&&board[i+1][j]=='O')||(j==1&&board[i][j-1]=='O')||(j==nj-2&&board[i][j+1]=='O')){
                visited[i][j] = true;
            }else{
                board[i][j] = 'X';
            }
        }
        visited[i][j] = true;
        dfs(board,i-1,j,ni,nj,visited);
        dfs(board,i+1,j,ni,nj,visited);
        dfs(board,i,j-1,ni,nj,visited);
        dfs(board,i,j+1,ni,nj,visited);
    }
    //新想法
    public void solve_new(char[][] board){
        for(int i=0;i<board.length;i++){
            dfs(board, i, 0, board.length, board[0].length);
            dfs(board, i, board[0].length-1, board.length, board[0].length);
        }
        for(int j=0;j<board[0].length;j++){
            dfs(board, 0, j, board.length, board[0].length);
            dfs(board, board.length-1, j, board.length, board[0].length);
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                if(board[i][j]=='A') {
                        board[i][j] = 'O';
                    } else if(board[i][j]=='O'){
                        board[i][j] = 'X';
                    }
                }
        }

    }
    public void dfs(char[][] board,int i,int j,int ni,int nj){
        if(i<0||i>=ni||j<0||j>=nj||board[i][j]!='O'){
            return;
        }
        board[i][j]='A';
        dfs(board,i-1,j,ni,nj);
        dfs(board,i+1,j,ni,nj);
        dfs(board,i,j-1,ni,nj);
        dfs(board,i,j+1,ni,nj);
    }
}
