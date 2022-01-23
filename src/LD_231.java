public class LD_231 {
    //判断是否为2的幂
    //如果n与n-1相与为0，则n为2的幂
    class Solution {
        public boolean isPowerOfTwo(int n) {
            return n>0&&(n&(n-1))==0;

        }
    }
}
