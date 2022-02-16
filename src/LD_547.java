public class LD_547 {
    //省份岛屿问题用dfs
    class Solution {
        public int findCircleNum(int[][] isConnected) {
            int num=0;
            int m=isConnected.length;
            boolean[]visited=new boolean[m];
            for(int i=0;i<m;i++){
                if(!visited[i]){
                    num++;
                    dfs(isConnected,i,visited);
                }

            }
            return num;

        }

        public void dfs(int[][] isConnected,int i,boolean[]visited){
            visited[i]=true;
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1&&!visited[j]){
                    dfs(isConnected,j,visited);
                }
            }
        }
    }
}
