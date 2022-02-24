public class LD_413 {
    class Solution {
        public int numberOfArithmeticSlices(int[] nums) {
            if(nums.length<3){
                return 0;
            }
            int m=nums.length;
            int sum=0;
            int []dp=new int[m];//dp[i]为以i为最后一个数的等差数组的子数组个数。如[1,2,3]与[1,2,3,4],当i=3时，dp[i]=1,为[1,2,3];当i=4时，dp[i]=2,为[1,2,3,4][2,3,4]比之前的就多了一个，为[i-2,i-1,i]其他的个数没变，内容多加了1。
            for(int i=2;i<m;i++){
                if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                    dp[i]=dp[i-1]+1;
                    sum+=dp[i];
                }
            }
            return sum;

        }
    }
}
