import java.util.Arrays;

public class LD_844 {
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            return Arrays.equals(helper(s,'#'),helper(t,'#'));
        }
        public char[]helper(String s,char c){
            char[] arr=s.toCharArray();
            int fast=0;
            int slow=0;
            for(slow=0;fast<arr.length;fast++){
                //如果没遇到#,给慢指针赋值
                if(arr[fast]!=c){
                    arr[slow]=arr[fast];
                    slow++;
                }
                //如果遇到#，慢指针后退一步，待下一次循环重新赋值
                else if(slow>0){
                    slow--;
                }
            }
            //返回数组arr中0到slow的元素
            return Arrays.copyOfRange(arr,0,slow);
        }
    }
}
