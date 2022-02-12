public class LD_153 {
    class Solution {
        public int findMin(int[] nums) {
            int left=0;
            int right=nums.length-1;
            int mid=0;
            while(left<=right){
                mid=left+(right-left)/2;
                if(nums[mid]<nums[right]){
                    right=mid;
                }else{
                    left=mid+1;
                }
            }
            return nums[mid];
        }
    }
}
