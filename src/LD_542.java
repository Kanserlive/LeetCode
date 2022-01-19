import java.util.LinkedList;
import java.util.Queue;
//01矩阵，写出1到最近的0的距离
//首先遍历数组，找出所有的0，将其写入新矩阵dist里面且写入queue里面，使其seen为ture表示已经遍历过，不能改变
//将queue里面的每个数都bfs一遍，找其上下左右并且进行赋值，最终当queue里面的值全部遍历完为止。
public class LD_542 {
    static class Solution {
        static int[][]dirs={{0,-1},{1,0},{0,1},{-1,0}};
        public int[][] updateMatrix(int[][] mat) {
            int m=mat.length, n=mat[0].length;
            int [][]dist=new int[m][n];
            boolean[][]seen=new boolean[m][n];
            Queue<int[]> queue=new LinkedList<int[]>();
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j]==0){
                        dist[i][j]=0;
                        seen[i][j]=true;
                        queue.offer(new int[]{i,j});
                    }
                }
            }
            while(!queue.isEmpty()){
                int[] cell=queue.poll();
                int x=cell[0],y=cell[1];
                for(int i=0;i<4;i++){
                    int mx=x+dirs[i][0];
                    int my=y+dirs[i][1];
                    if(mx>=0&&mx<m&&my>=0&&my<n&&!seen[mx][my]){
                        dist[mx][my]=dist[x][y]+1;
                        queue.offer(new int[]{mx,my});
                        seen[mx][my]=true;
                    }
                }
            }
            return dist;

        }
    }
}