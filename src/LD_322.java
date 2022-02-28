public class LD_322 {
    //完全背包问题
    //DP【i】的意义为凑成总金额为i的钱所需最少的硬币个数
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int max=Integer.MAX_VALUE;
            int []dp=new int[amount+1];
            for(int j=0;j<dp.length;j++){
                dp[j]=max;
            }
            dp[0]=0;
            for(int i=0;i<coins.length;i++){
                for(int j=coins[i];j<=amount;j++){
                    if(dp[j-coins[i]]!=max){
                        dp[j]=Math.min(dp[j-coins[i]]+1,dp[j]);//最后一个硬币为coins[i]，刚好组成dp[j]；
                        //所以组成总数为j-coins[i]的硬币个数（即DP[j]）得加上1，才能组成总数为j-coins[i]的硬币个数(即DP[j-coins[i]])
                    }
                }
            }
            return dp[amount]==max?-1:dp[amount];

        }
    }
}
