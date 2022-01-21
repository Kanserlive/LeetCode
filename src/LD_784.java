import java.util.ArrayList;
import java.util.List;

public class LD_784 {

    //回溯算法
    class Solution {
        List<String> result=new ArrayList<>();
        public List<String> letterCasePermutation(String s) {
            char[] chs=s.toCharArray();
            int n=chs.length;
            letterCasePermutationHelp(n,chs,0);
            return result;

        }

        public void letterCasePermutationHelp(int n,char[]chs,int startIndex){
            result.add(new String(chs));
            for(int i=startIndex;i<n;i++){
                if(!Character.isDigit(chs[i])){
                    //temp的作用是储存最初chs里面的值，传入下一个大for循环。
                    char temp=chs[i];
                    chs[i]=(char)(chs[i]-'a'>=0?chs[i]-32:chs[i]+32);
                    letterCasePermutationHelp(n,chs,i+1);
                    chs[i]=temp;
                }
            }

        }
    }
}
