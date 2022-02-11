public class LD_34 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[]res=new int[]{-1,-1};
            res[0]=binarySearch(nums,target,true);
            res[1]=binarySearch(nums,target,false);
            return res;

        }
        public int binarySearch(int[] nums,int target,boolean leftOrRight){
            int res=-1;
            int left=-1,right=nums.length,mid;
            while(left+1!=right){
                mid=left+(right-left)/2;
                if(nums[mid]<target){
                    left=mid;
                }else if(nums[mid]>target){
                    right=mid;
                }else{
                    res=mid;
                    if(leftOrRight){
                        right=mid;
                    }else{
                        left=mid;
                    }
                }
            }
            return res;
        }
    }
}
