public class LD_91 {
    class Solution {
        public int numDecodings(String s) {
            int m=s.length();
            s=" "+s;
            int []dp=new int[m+1];
            char[]str=s.toCharArray();
            dp[0]=1;
            for(int i=1;i<=m;i++){
                int a=str[i]-'0';
                int b=str[i]-'0'+(str[i-1]-'0')*10;
                if(a>=1&&a<=9){
                    dp[i]=dp[i-1];
                }
                if(b>=10&&b<=26){
                    dp[i]+=dp[i-2];
                }
            }
            return dp[m];

        }
    }
}
