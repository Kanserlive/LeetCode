import java.util.Scanner;

public class LQ_263 {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int[]nums=new int[num];
        int sum=0;
        for(int i=0;i<num;i++){
            nums[i]=scan.nextInt();
            sum+=nums[i];
        }
        boolean dp[][]=new boolean[num][200006];
        dp[0][nums[0]]=true;
        for(int i=1;i<num;i++){
            for (int j=1;j<=sum;j++){
                dp[i][j]=dp[i-1][j];
                if(!dp[i][j]){
                    if(dp[i-1][j+nums[i]]||dp[i-1][Math.abs(j-nums[i])]||j==nums[i]){
                        dp[i][j]=true;
                    }
                }
            }
        }
        int ans=0;
        for(int j=0;j<=sum;j++){
           if(dp[num-1][j]){
               ans++;
           }
        }
        System.out.print(ans);
    }
}
