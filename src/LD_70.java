public class LD_70 {
    //爬楼梯到第n层有几种方法
    //到第n层只能从n-1和n-2层上去
    //所以到第n层方法是n-1和n-2加一起的
    //第三层是1+2，依此类推
    class Solution {
        public int climbStairs(int n) {
            if(n==1)
                return 1;
            if(n==2)
                return 2;
            int a=1,b=2,temp;
            for(int i=3;i<=n;i++){
                temp=a;
                a=b;
                b=temp+a;
            }
            return b;

        }
    }
}
