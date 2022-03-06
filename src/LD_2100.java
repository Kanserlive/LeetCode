import java.util.ArrayList;
import java.util.List;

public class LD_2100 {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> res=new ArrayList<>();
        int m=security.length;
        int []dp1=new int[m];
        int []dp2=new int[m];
        for(int i=1;i<m;i++){
            if(security[i]<=security[i-1]){
                dp1[i]=dp1[i-1]+1;
            }else{
                dp1[i]=0;
            }
        }
        for(int i=m-2;i>=0;i--){
            if(security[i]<=security[i+1]){
                dp2[i]=dp2[i+1]+1;
            }else{
                dp2[i]=0;
            }
        }
        for(int i=time;i<m-time;i++){
            if(dp1[i]>=time&&dp2[i]>=time){
                res.add(i);
            }
        }
        return res;

    }

    public static void main(String[] args){
        int[]sb=new int[]{5,3,3,3,5,6,2};
        int nb=2;
        System.out.println(goodDaysToRobBank(sb,nb));
    }
}
