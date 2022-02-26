public class LD_673 {
    class Solution {
        public int findNumberOfLIS(int[] nums) {
            if(nums==null){
                return 0;
            }
            int n=nums.length;
            if(n==1){
                return 1;
            }
            int[]dp=new int[n+1];
            for(int i = 0; i < dp.length; i++) dp[i] = 1;
            int[]count=new int[n+1];
            for(int i = 0; i < count.length; i++) count[i] = 1;
            int result=0;
            for(int i=1;i<n;i++){
                for(int j=0;j<i;j++){
                    if(nums[i]>nums[j]){
                        if(dp[j]+1>dp[i]){
                            count[i]=count[j];
                        }else if(dp[j]+1==dp[i]){
                            count[i]+=count[j];
                        }
                        dp[i]=Math.max(dp[i],dp[j]+1);
                    }
                }
                if(dp[i]>result){
                    result=dp[i];
                }
            }
            int countresult=0;
            for(int i=0;i<n;i++){
                if(dp[i]==result){
                    countresult+=count[i];
                }
            }
            return countresult;
        }
    }
}
