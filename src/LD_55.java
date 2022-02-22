public class LD_55 {
    public static boolean canJump(int[] nums) {
        int m=nums.length;
        if(m==0){
            return false;
        }
        if(m==1&&nums[0]==0){
            return true;
        }
        for(int i=m-1;i>=0;i--){
            if(nums[i]==0){
                int j;
                for(j=i;j>=0;j--){
                    if(nums[j]>i-j){
                        break;
                    }
                }
                if(j==-1){
                    if(i!=m-1){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        int nums[]={0,1};
        System.out.println(canJump(nums));
    }
}
