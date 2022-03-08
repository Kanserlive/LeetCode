public class LD_2055 {
    class Solution {
        public int[] platesBetweenCandles(String s, int[][] queries) {
            char []cs=s.toCharArray();
            int n=cs.length;
            int m=queries.length;
            int []l=new int[n+1];
            int []r=new int[n+1];
            int []sum=new int[n+1];
            int []res=new int[m];
            for(int i=0,j=n-1,p=-1,q=-1;i<n;i++,j--){
                if(cs[i]=='|') p=i;
                if(cs[j]=='|') q=j;
                l[i]=p;
                r[j]=q;
                sum[i+1]=sum[i]+(cs[i]=='*'?1:0);
            }
            for(int i=0;i<m;i++){
                int a=queries[i][0];
                int b=queries[i][1];
                int c=l[b];
                int d=r[a];
                if(d!=-1&&d<=c)
                    res[i]=sum[c+1]-sum[d];
            }
            return res;

        }
    }
}
