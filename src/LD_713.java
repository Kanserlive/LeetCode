public class LD_713 {
    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            if (k <= 1) return 0;
            int m=nums.length;
            int ans=0,sum=1;
            for(int left=0,right=0;right<m;right++){
                sum*=nums[right];
                while(sum>=k){
                    sum/=nums[left++];
                }
                ans += right - left + 1;
                //right-left+1的切入点是思维要放在区间的右边往左边延伸，例如区间[1, 2, 3, 4]满足要求，固定住right(4)的点，可选区间右[4]、[4, 3]、[4, 3, 2]、[4, 3, 2, 1]即为数组的长度，也就是right-left+1。而right是递增的，此时[1, 2, 3]的区间已经处理完（[3]、[3, 2]、[3、2、1]）。如果从left为切入点，就会有[1, 2, 3, 4]和[1, 2, 3]都有[1]，不就是重复了的错乱思维。
            }
            return ans;

        }
    }
}
