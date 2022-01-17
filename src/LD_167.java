public class LD_167 {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            for(int i=0,j=numbers.length-1;i<j;){
                int sum=numbers[i]+numbers[j];
                if(sum==target){
                    return new int[]{i+1,j+1};
                }else if(sum<target){
                    i++;
                }else{
                    j--;
                }

            }
            return null;

        }
    }                        //双指针法

    //------------------------------------------------------------//

    public static int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int other=target-numbers[i];
            int start=i;
            int end=numbers.length;
            while(start+1!=end){
                int mid=start+((end-start)>>1);
                if(numbers[start+1]==other){
                    return new int[]{i+1,start+2};
                }
                else if(numbers[mid]<other){
                    start=mid;
                }else{
                    end=mid;
                }
            }
        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args){
        int nums[]={5,25,75};
        System.out.println(twoSum(nums,100));
    }
}                       //二分法



