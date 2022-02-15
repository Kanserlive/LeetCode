public class LD_209 {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int m=nums.length;
            int sum=0;
            int mini=0;
            for(int left=0,right=0;right<m;right++){
                sum+=nums[right];
                while(sum>=target){
                    mini=mini==0?right-left+1:Math.min(mini,right-left+1);
                    sum-=nums[left++];
                }
            }
            return mini;

        }
    }
}
