import java.util.List;

public class LD_120 {
    //三角形遍历求最小值，从下到上
    class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            int n=triangle.size();
            int[]dp=new int[n];
            //先给dp赋值，三角形最下面一层的值给dp
            for(int i=0;i<n;i++){
                dp[i]=triangle.get(n-1).get(i);
            }
            //从倒数第二层开始，每个dp是（下一层和他的邻居中间的最小的那个）+当前值决定
            for(int i=n-2;i>=0;i--){
                for(int j=0;j<=i;j++){
                    dp[j]=Math.min(dp[j],dp[j+1])+triangle.get(i).get(j);
                }
            }
            //从下到上一直到dp[0]截至
            return dp[0];

        }
    }
}
