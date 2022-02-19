import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LD_90 {
    class Solution {
        List<List<Integer>> resoult=new ArrayList<>();
        LinkedList<Integer> path=new LinkedList<>();
        boolean[]set;
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            if(nums.length==0){
                resoult.add(path);
                return resoult;
            }
            Arrays.sort(nums);
            set=new boolean[nums.length];
            subsetsWithDupHelper(nums,0);
            return resoult;
        }

        public void subsetsWithDupHelper(int[]nums,int start){
            resoult.add(new ArrayList<>(path));
            if(start>=nums.length){
                return;
            }
            for(int i=start;i<nums.length;i++){
                if(i>0&&nums[i]==nums[i-1]&&!set[i-1]){//如果数值与左相邻的相同，且为回溯之后的同树层值（false），则跳过
                    continue;
                }
                path.add(nums[i]);
                set[i]=true;//开始向下长枝时为true
                subsetsWithDupHelper(nums,i+1);
                path.removeLast();
                set[i]=false;//回溯后为false
            }
        }
    }
}
