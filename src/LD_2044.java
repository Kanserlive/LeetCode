public class LD_2044 {
    class Solution {
        int sum=0;
        public int countMaxOrSubsets(int[] nums) {
            int n=nums.length;
            int max=0;
            for(int i=0;i<n;i++){
                max|=nums[i];
            }
            dfs(nums,0,0,max);
            return sum;
        }

        public void dfs(int[]nums,int i,int num,int max){
            if(i==nums.length){
                if(num==max){
                    sum++;
                }
                return;
            }
            dfs(nums,i+1,num,max);
            dfs(nums,i+1,num|nums[i],max);
        }
    }
}
