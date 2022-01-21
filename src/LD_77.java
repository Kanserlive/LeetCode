import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//回溯算法+剪枝。
public class LD_77 {
    class Solution {
        List<List<Integer>>result=new ArrayList<>();
        LinkedList<Integer> path=new LinkedList<>();
        public List<List<Integer>> combine(int n, int k) {
            combineHelper(n,k,1);
            return result;
        }

        public void combineHelper(int n,int k,int startindex){
            if(path.size()==k){
                result.add(new LinkedList<>(path));
                return;
            }
            for(int i=startindex;i<=n-(k-path.size())+1;i++){
                path.add(i);
                combineHelper(n,k,i+1);
                path.removeLast();
            }

        }
    }
}
