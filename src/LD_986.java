import java.util.ArrayList;
import java.util.List;

public class LD_986 {
    class Solution {
        public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
            List<int[]> arr=new ArrayList<>();
            int i=0;
            int j=0;
            while(i<firstList.length&&j<secondList.length){
                int left=Math.max(firstList[i][0],secondList[j][0]);// 交集区间的左端，取它们的较大者
                int right=Math.min(firstList[i][1],secondList[j][1]);// 交集区间的右端，取它们的较小者
                if(left<=right){// 形成了交集区间
                    arr.add(new int[]{left,right});
                }
                if(firstList[i][1]<secondList[j][1]){// 谁先结束，谁的指针就步进，考察下一个子区间
                    i++;
                }else{
                    j++;
                }
            }
            return arr.toArray(new int[0][0]);

        }
    }
}
