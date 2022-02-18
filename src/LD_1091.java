import java.util.LinkedList;
import java.util.Queue;

public class LD_1091 {
    class Solution {
        public int shortestPathBinaryMatrix(int[][] grid) {
            if(grid==null||grid.length==0||grid[0].length==0||grid[0][0]==1){
                return -1;
            }
            int m=grid.length,n=grid[0].length;
            int[][]dir={{0,1},{1,0},{0,-1},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
            Queue<int[]> queue=new LinkedList<>();
            queue.add(new int[]{0,0});
            grid[0][0]=1;
            int path=1;
            while(!queue.isEmpty()){
                int size=queue.size();
                while(size-->0){
                    int[] cur=queue.poll();
                    int x=cur[0];
                    int y=cur[1];
                    if(x==m-1 && y==n-1){
                        return path;
                    }
                    for(int i=0;i<8;i++){
                        int mx=x+dir[i][0];
                        int my=y+dir[i][1];
                        if(mx<0||mx>=m||my<0||my>=n||grid[mx][my]==1){
                            continue;
                        }
                        queue.add(new int[]{mx,my});
                        grid[mx][my]=1;
                    }
                }
                path++;
            }
            return -1;
        }
    }
}
