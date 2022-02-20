import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LD_40 {
    class Solution {
        List<List<Integer>> res=new ArrayList<>();
        LinkedList<Integer> path=new LinkedList<>();
        boolean []visited;
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            if(candidates.length==0){
                res.add(path);
                return res;
            }
            int sum=0;
            visited=new boolean[candidates.length];
            Arrays.sort(candidates);
            combinationSumhelper(candidates,target,sum,0);
            return res;
        }

        public void combinationSumhelper(int[] candidates,int target,int sum,int star){
            if(sum>target){
                return;
            }
            if(sum==target){
                res.add(new ArrayList<>(path));
                return;
            }
            for(int i=star;i<candidates.length;i++){
                if(i>0&&candidates[i]==candidates[i-1]&&!visited[i-1]){
                    continue;
                }
                path.add(candidates[i]);
                visited[i]=true;
                sum+=candidates[i];
                combinationSumhelper(candidates,target,sum,i+1);
                sum-=path.get(path.size()-1);
                path.removeLast();
                visited[i]=false;
            }
        }
    }
}
