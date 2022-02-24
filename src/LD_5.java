public class LD_5 {
    class Solution {
        public String longestPalindrome(String s) {
            int m=s.length();
            int maxlenth=1;
            boolean[][]dp=new boolean[m][m];
            int left=0;
            int right=0;
            for(int i=s.length()-1;i>=0;i--){
                for(int j=i;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)){
                        if(j-i<=1){
                            dp[i][j]=true;
                        }else if(dp[i+1][j-1]){
                            dp[i][j]=true;
                        }
                    }
                    if(dp[i][j]&&j-i+1>maxlenth){
                        maxlenth=j-i+1;
                        left=i;
                        right=j;
                    }
                }
            }
            return s.substring(left,left+maxlenth);

        }
    }
}
