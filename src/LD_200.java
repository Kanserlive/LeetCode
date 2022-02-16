public class LD_200 {
    //DFS解决岛屿大小以及个数问题
    class Solution {
        public int numIslands(char[][] grid) {
            int num=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]=='1'){
                        num++;
                        dfs(grid,i,j);
                    }
                }
            }
            return num;

        }

        public void dfs(char[][]grid,int i,int j){
            if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0'){
                return;
            }
            grid[i][j]='0';
            dfs(grid,i+1,j);
            dfs(grid,i,j+1);
            dfs(grid,i-1,j);
            dfs(grid,i,j-1);
        }
    }
}
