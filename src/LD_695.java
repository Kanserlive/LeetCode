public class LD_695 {
    /*
    深度优先搜索
    找岛屿大小问题
    先遍历二维数组当遇到1时进入dsf找出周围的岛屿，并且使岛屿被统计后变为0，得到num值，继续遍历，直到完成。
    dsf就是dsf里面嵌套四个方向的dsf，直到算出全部岛屿的大小为止。

    */
    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int max=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==1){
                        max=Math.max(max,dfs(grid,i,j));
                    }
                }
            }
            return max;

        }

        public int dfs(int[][] grid,int i,int j){
            if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0){
                return 0;
            }
            grid[i][j]=0;
            int num=1;
            num+=dfs(grid,i+1,j);
            num+=dfs(grid,i-1,j);
            num+=dfs(grid,i,j+1);
            num+=dfs(grid,i,j-1);
            return num;
        }
    }
}
