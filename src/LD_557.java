public class LD_557 {
    //用split去空格，然后直接StringButter.revers()反转
    class Solution {
        public String reverseWords(String s) {
            String[]str=s.split(" ");
            StringBuffer buffer=new StringBuffer();
            for(int i=0;i<str.length;i++){
                buffer.append(new StringBuffer(str[i]).reverse().toString());
                buffer.append(" ");
            }
            return buffer.toString().trim();

        }
    }

    //双指针反转，局部原地反转
    class Solution1 {
        public String reverseWords(String s) {
            char[] arr=s.toCharArray();
            int n=arr.length;
            int left=0,right=0;
            while(right<=n){
                if(right==n||arr[right]==' '){
                    reverseSting(arr,left,right-1);
                    left=right+1;
                }
                right++;
            }
            return new String(arr);

        }

        public void reverseSting(char[]nums,int left,int right){
            while(left<right){
                nums[left]^=nums[right];
                nums[right]^=nums[left];
                nums[left]^=nums[right];
                left++;
                right--;
            }
        }
    }
}
