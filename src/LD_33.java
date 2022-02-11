public class LD_33 {
    class Solution {
        public int search(int[] nums, int target) {
            int left=-1,right=nums.length;
            while(left+1!=right){
                int mid=left+(right-left)/2;
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]>=nums[left+1]){
                    if(target>=nums[left+1]&&target<nums[mid]){
                        right=mid;
                    }else{
                        left=mid;
                    }
                }
                else{
                    if(target>nums[mid]&&target<=nums[right-1]){
                        left=mid;
                    }else{
                        right=mid;
                    }
                }
            }
            return -1;

        }
    }
}
