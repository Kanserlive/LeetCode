public class LD_2104 {
    //解法1，局部DP
    class Solution {
        //定义 f[l][r][k]为区间[l,r]范围内的最值情况，其中 k 非 0 即 1：f[l][r][0]
        // 代表区间 [l, r]内的最小值，f[l][r][1]代表区间[l,r] 内的最大值。
        public long subArrayRanges(int[] nums) {
            int n = nums.length;
            int[][][] f = new int[n][n][2];
            long ans = 0;
            for (int i = 0; i < n; i++) f[i][i][0] = f[i][i][1] = nums[i];
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    //f[l][r][0]=min(f[l][r−1][0],nums[r])
                    //f[l][r][1]=max(f[l][r−1][1],nums[r])
                    f[i][j][0] = Math.min(nums[j], f[i][j - 1][0]);
                    f[i][j][1] = Math.max(nums[j], f[i][j - 1][1]);
                    ans += f[i][j][1] - f[i][j][0];
                }
            }
            return ans;
        }
    }
//解法2，暴力破解，遍历数组
    class Solution1 {
        public long subArrayRanges(int[] nums) {
            long res=0;
            for(int i=0;i<nums.length;i++){
                int min=nums[i];
                int max=nums[i];
                for(int j=i+1;j<nums.length;j++){
                    min=Math.min(min,nums[j]);
                    max=Math.max(max,nums[j]);
                    res+=max-min;
                }
            }
            return res;

        }
    }
}
