import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LD_39 {
    class Solution {
        List<List<Integer>> res=new ArrayList<>();
        LinkedList<Integer> path=new LinkedList<>();
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            if(candidates.length==0){
                res.add(path);
                return res;
            }
            int sum=0;
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
                path.add(candidates[i]);
                sum+=candidates[i];
                combinationSumhelper(candidates,target,sum,i);
                sum-=path.get(path.size()-1);
                path.removeLast();
            }
        }
    }
}
