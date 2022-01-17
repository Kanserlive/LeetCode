public class LD_977 {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int left=0;
            int right=nums.length-1;
            int []result=new int[nums.length];
            int index=result.length-1;
            while(left<=right){
                if(nums[left]*nums[left]<nums[right]*nums[right]){
                    result[index]=nums[right]*nums[right];
                    index--;
                    right--;
                }else{
                    result[index]=nums[left]*nums[left];
                    index--;
                    left++;
                }
            }
            return result;

        }
    }
}
