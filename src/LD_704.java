class LD_704 {
    public static int search(int[] nums, int target) {
        if(target<nums[0] || target>nums[nums.length-1])
            return -1;
        int left=-1,right=nums.length;
        while(left+1!=right){
            int mid=left+((right-left)>>1);
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid;
            else if (nums[mid] > target)
                right = mid;
        }
        return -1;

    }

    public static void main(String[] args){
        int nums[]={1,2,3,4,5,6,7,8,9};
        System.out.println(search(nums,6));
    }

}

