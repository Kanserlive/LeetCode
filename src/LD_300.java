public class LD_300 {
    class Solution {
        public int lengthOfLIS(int[] nums) {
            if(nums==null){
                return 0;
            }
            int n=nums.length;
            if(n==1){
                return 1;
            }
            int[]dp=new int[n+1];
            int resoult=0;
            for(int i=1;i<n;i++){
                for(int j=0;j<i;j++){
                    if(nums[i]>nums[j]){
                        dp[i]=Math.max(dp[i],dp[j]+1);
                    }
                }
                if(dp[i]>resoult){
                    resoult=dp[i];
                }
            }
            return resoult+1;

        }
    }
}
