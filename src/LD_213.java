public class LD_213 {
    class Solution {
        public int rob(int[] nums) {
            int m=nums.length;
            if(m==0){
                return 0;
            }
            if(m==1){
                return nums[0];
            }
            if(m==2){
                return Math.max(nums[0],nums[1]);
            }
            int sum=Math.max(robRange(nums,0,m-2),robRange(nums,1,m-1));
            return sum;
        }

        public int robRange(int[] nums,int start,int end){
            int first=nums[start];
            int second=Math.max(first,nums[start+1]);
            for(int i=start+2;i<=end;i++){
                int temp=second;
                second=Math.max(first+nums[i],second);
                first=temp;
            }
            return Math.max(first,second);
        }
    }
}
