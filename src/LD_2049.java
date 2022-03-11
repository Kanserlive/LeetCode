import java.util.ArrayList;
import java.util.List;

public class LD_2049 {
    static long maxScore = 0;
    static int cnt = 0;
    static int n;
    static List<Integer>[]children;
    public static int countHighestScoreNodes(int[] parents) {
        n=parents.length;
        children=new List[n];
        for(int i=0;i<n;i++){
            children[i]=new ArrayList<Integer>();
        }
        for (int i = 0; i < n; i++) {
            int p = parents[i];
            if (p != -1) {
                children[p].add(i);
            }
        }
        dfs(0);
        return cnt;
    }

    public static int dfs(int node){
        int sum=1;
        long score=1;
        for(int num:children[node]){
            int t=dfs(num);
            score*=t;
            sum+=t;
        }
        if(node!=0){
            score*=n-sum;
        }
        if(score==maxScore){
            cnt++;
        }else if(score>maxScore){
            maxScore=score;
            cnt=1;
        }
        return sum;
    }

    public static void main(String args[]){
        int nums[]={-1,2,0,2,0};
        System.out.println(countHighestScoreNodes(nums));
    }
}
