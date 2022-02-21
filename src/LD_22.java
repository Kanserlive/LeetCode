import java.util.ArrayList;
import java.util.List;

public class LD_22 {
    class Solution {
        List<String> res=new ArrayList<>();
        public List<String> generateParenthesis(int n) {
            generateParenthesisHelper("",0,0,n);
            return res;
        }

        public void generateParenthesisHelper(String ans,int left,int right,int n){
            if(left>n||right>n||right>left){
                return;
            }
            if(left==n&&right==n){
                res.add(ans);
            }
            if(left>=right){
                String ans1=new String(ans);
                generateParenthesisHelper(ans+"(",left+1,right,n);
                generateParenthesisHelper(ans1+")",left,right+1,n);
            }
        }
    }
}
