public class LD_191 {
    //位运算，将n和1相与，最后一位若为1，则相与为2，count++,然后n向右移一位。
    //32位是上限
    public class Solution {
        // you need to treat n as an unsigned value
        int count=0;
        public int hammingWeight(int n) {
            for(int i=0;i<32;i++){
                count+=n&1;
                n>>=1;
            }
            return count;
        }
    }
}
