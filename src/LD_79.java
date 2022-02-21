public class LD_79 {
    class Solution {
        int[][]dir={{0,1},{1,0},{0,-1},{-1,0}};
        boolean same=false;
        public boolean exist(char[][] board, String word) {
            if(word==""){
                return true;
            }
            if(board==null){
                return false;
            }
            int m=board.length,n=board[0].length;
            boolean[][] visited=new boolean[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    dfs(i,j,visited,board,word,0);
                }
            }
            return same;
        }
        public void dfs(int i,int j,boolean[][]visited,char[][] board,String word,int num){
            if(i<0||i>=board.length||j<0||j>=board[0].length||visited[i][j]||board[i][j]!=word.charAt(num)||same){
                return;
            }
            if(num==word.length()-1){
                same=true;
                return;
            }
            visited[i][j]=true;
            for(int p=0;p<4;p++){
                int mi=i+dir[p][0];
                int mj=j+dir[p][1];
                dfs(mi,mj,visited,board,word,num+1);
            }
            visited[i][j]=false;
        }
    }
}
