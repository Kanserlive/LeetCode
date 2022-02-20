import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LD_47 {
    class Solution {
        List<List<Integer>> res=new ArrayList<>();
        LinkedList<Integer> path=new LinkedList<>();
        boolean []visited;
        public List<List<Integer>> permuteUnique(int[] nums) {
            if(nums.length==0){
                res.add(path);
                return res;
            }
            visited=new boolean[nums.length];
            Arrays.sort(nums);
            permuteUniqueHelper(nums);
            return res;

        }

        public void permuteUniqueHelper(int[]nums){
            if(path.size()==nums.length){
                res.add(new ArrayList<>(path));
                return;
            }
            for(int i=0;i<nums.length;i++){
                if(i>0&&nums[i]==nums[i-1]&&!visited[i-1]){
                    continue;
                }
                if(visited[i]==false){
                    path.add(nums[i]);
                    visited[i]=true;
                    permuteUniqueHelper(nums);
                    path.removeLast();
                    visited[i]=false;
                }
            }

        }
    }
}
