public class LD_45 {
    class Solution {
        public int jump(int[] nums) {
            if(nums==null){
                return 0;
            }
            int k=0;
            int end=0;
            int path=0;
            for(int i=0;i<nums.length-1;i++){
                k=Math.max(k,i+nums[i]);
                if(i==end){
                    path++;
                    end=k;
                }
            }
            return path;

        }
    }
}
