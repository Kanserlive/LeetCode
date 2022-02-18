public class LD_130 {
    class Solution {
        public void solve(char[][] board) {
            int m=board.length,n=board[0].length;
            if(m<=1||n<=1)return;
            for(int i=0;i<n;i++){
                dfs(board,0,i);
                dfs(board,m-1,i);
            }
            for(int j=1;j<m-1;j++){
                dfs(board,j,0);
                dfs(board,j,n-1);
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(board[i][j]=='B'){
                        board[i][j]='O';
                    }else{
                        board[i][j]='X';
                    }
                }
            }
        }

        public void dfs(char[][] board,int i, int j){
            if(i>=0&&i<board.length&&j>=0&&j<board[0].length&&board[i][j]=='O'){
                board[i][j]='B';
                dfs(board,i-1,j);
                dfs(board,i,j-1);
                dfs(board,i+1,j);
                dfs(board,i,j+1);
            }
        }
    }
}
