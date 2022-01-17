public class LD_283 {
    class Solution {
        public void moveZeroes(int[] nums) {
            int start=0;
            int end=0;
            while(end<nums.length){
                if(nums[end]!=0){
                    nums[start]=nums[end];
                    start++;
                    end++;
                }else{
                    end++;
                }
            }

            while(start<nums.length){
                nums[start++]=0;
            }

        }
    }
}
