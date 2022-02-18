import java.util.ArrayList;
import java.util.List;

public class LD_797 {
    class Solution {
        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
            if(graph[0]==null){
                return null;
            }
            List<List<Integer>>fa=new ArrayList<>();
            List<Integer>son=new ArrayList<>();
            son.add(0);
            dfs(fa,son,graph,0);
            return fa;
        }

        public void dfs(List<List<Integer>> fa, List<Integer> son, int[][]graph, int i){
            for(int j=0;j<graph[i].length;j++){
                List<Integer> tmp = new ArrayList<>(son);
                tmp.add(graph[i][j]);
                if(graph[i][j]==graph.length-1){
                    fa.add(tmp);
                    continue;
                }
                dfs(fa,tmp,graph,graph[i][j]);
            }
        }
    }
}
