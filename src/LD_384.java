import java.util.Random;

public class LD_384 {
    class Solution {
        int []num;
        int n;
        Random random=new Random();

        private void swap(int[]arr,int i,int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public Solution(int[] nums) {
            num= nums;
            n=num.length;
        }

        public int[] reset() {
            return num;

        }

        public int[] shuffle() {
            int[]arr=num.clone();
            for(int i=0;i<n;i++){
                swap(arr,i,i+random.nextInt(n-i));//洗牌算法，
            }
            return arr;
        }
    }
//具体的，我们从前往后尝试填充 [0, n - 1][0,n−1] 该填入什么数时，通过随机当前下标与（剩余的）哪个下标进行值交换来实现。
//对于下标 xx 而言，我们从 [x, n - 1][x,n−1] 中随机出一个位置与 xx 进行值交换，当所有位置都进行这样的处理后，我们便得到了一个公平的洗牌方案。

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
}
