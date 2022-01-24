public class LD_190 {
    //位运算
    public class Solution {
        // you need treat n as an unsigned value
        int ans=0;
        public int reverseBits(int n) {
            int i=32;
            while(i>0){
                ans<<=1;
                ans+=n&1;
                n>>=1;
                i--;
            }
            return ans;
        }
    }
}
