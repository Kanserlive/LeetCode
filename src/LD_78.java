import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LD_78 {
    class Solution {
        List<List<Integer>> result=new ArrayList<>();
        LinkedList<Integer> path=new LinkedList<>();
        public List<List<Integer>> subsets(int[] nums) {
            if(nums.length==0){
                result.add(new ArrayList<>());
                return result;
            }
            subsetsHelper(nums,0);
            return result;
        }

        public void subsetsHelper(int[] nums,int start){
            result.add(new ArrayList<>(path));//将子数组加入父数组中
            if(start>=nums.length){//判断递归的结束条件
                return;
            }
            for(int i=start;i<nums.length;i++){
                path.add(nums[i]);
                subsetsHelper(nums,i+1);//递归遍历
                path.removeLast();//回溯
            }
        }
    }
}
