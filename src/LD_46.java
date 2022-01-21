import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//回溯算法+剪枝
public class LD_46 {
    class Solution {
        List<List<Integer>>result=new ArrayList<>();
        LinkedList<Integer> path=new LinkedList<>();
        public List<List<Integer>> permute(int[] nums) {
            permuteHelper(result,path,nums);
            return result;

        }

        public void permuteHelper(List<List<Integer>>result,LinkedList<Integer>path,int[]nums){
            if(path.size()==nums.length){
                result.add(new ArrayList<>(path));
                return;
            }
            for(int num:nums){
                if(!path.contains(num)){
                    path.add(num);
                    permuteHelper(result,path,nums);
                    path.removeLast();
                }
            }

        }
    }
}
