public class LD_343 {
    //dp[i]的意义为：分拆数字i，可以得到的最大乘积为dp[i]。
    class Solution {
        public int integerBreak(int n) {
            int []dp=new int[n+1];
            dp[2]=1;
            for(int i=3;i<=n;i++){
                for(int j=1;j<=i-1;j++){
                    dp[i]=Math.max(dp[i],Math.max(j*(i-j),dp[i-j]*j));
                    //也可以这么理解，j * (i - j) 是单纯的把整数拆分为两个数相乘，而j * dp[i - j]是拆分成两个以及两个以上的个数相乘。
                    //
                    //如果定义dp[i - j] * dp[j] 也是默认将一个数强制拆成4份以及4份以上了。
                    //
                    //所以递推公式：dp[i] = max({dp[i], (i - j) * j, dp[i - j] * j});
                }
            }
            return dp[n];
        }
    }
}
