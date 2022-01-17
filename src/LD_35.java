class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int left=-1;
        int right=nums.length;
        while(left+1!=right){
            int mid=left+((right-left)>>1);
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                left=mid;
            else if(nums[mid]>target)
                right=mid;

        }
        return right;

    }
}
