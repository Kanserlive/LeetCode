public class LD_201 {
    class Solution {
        public int rangeBitwiseAnd(int left, int right) {
            if(left==0){
                return 0;
            }
            //除了left到right的公共部分其他的位都至少有一个0，相与必为0，所以最后公共部分相与为公共部分本身，其他位为0
            int i=0;
            while(left!=right){
                left>>=1;
                right>>=1;
                i++;
            }
            right<<=i;
            return right;

        }
    }
}
