import java.util.LinkedList;
import java.util.Queue;
//烂橘子问题 求什么时间橘子烂完
//BKS 先找出烂橘子，全设为true，空的也设为true，然后BKS，不为true的进入改造为true，最后全部变为烂橘子。
public class LD_994 {
    class Solution {
        int[][]dirs={{0,1},{1,0},{-1,0},{0,-1}};
        public int orangesRotting(int[][] grid) {
            int m=grid.length,n=grid[0].length;
            Queue<int[]> queue=new LinkedList<int[]>();
            boolean[][] seen=new boolean[m][n];
            int[][] dist=new int[m][n];
            int num1=0,num2=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j]==2){
                        dist[i][j]=2;
                        seen[i][j]=true;
                        queue.offer(new int[]{i,j});
                        num2++;
                    }else if(grid[i][j]==1){
                        num1++;
                    }else if(grid[i][j]==0){
                        dist[i][j]=0;
                        seen[i][j]=true;
                    }
                }
            }
            int num=num1+num2;
            if(num2==num){
                return 0;
            }
            int sum=0;
            //第一个while每次循环是每个单位时间全部烂橘子的传染过程
            while(!queue.isEmpty()){
                int size = queue.size();
                //for里面是每次循环每个单位时间某一个烂橘子的传染过程
                for(int imp=0;imp<size;imp++){
                    int[] cell=queue.poll();
                    int x=cell[0],y=cell[1];
                    //for里面是每次循环每个单位时间某一个烂橘子的上下左右遍历传染过程
                    for(int i=0;i<4;i++){
                        int nx=x+dirs[i][0];
                        int ny=y+dirs[i][1];
                        //判断如果是好橘子，即不为true，则变为烂橘子
                        if(nx>=0&&nx<m&&ny>=0&&ny<n&&!seen[nx][ny]){
                            dist[nx][ny]=dist[x][y]+1;
                            seen[nx][ny]=true;
                            queue.offer(new int[]{nx,ny});
                            num1--;
                            num2++;
                        }


                    }
                }
                if (!queue.isEmpty()) {
                    sum++;
                }

            }
            //全部变为烂橘子，但最后一波的烂橘子还没出队，所以下次还会进入while循环，所以这里应该提前结束循环。
            if(num1!=0){
                return -1;
            }
            return sum;

        }
    }
}
