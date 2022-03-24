import java.util.Scanner;

public class LQ_1006 {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int nums[][]=new int[num][num];
        for(int i=0;i<num;i++){
            for (int j=0;j<num;j++){
                nums[i][j]=scan.nextInt();
            }
        }
        int [][]dp=new int[num][num];
        int sum_1=0;
        int sum_2=nums[0][0];
        for(int i=0;i<num;i++){
            for (int j=0;j<num;j++){
                if(i==0){
                    sum_1+=nums[i][j];
                    dp[i][j]=sum_1;
                }else if(j==0){
                    sum_2+=nums[i][j];
                    dp[i][j]=sum_2;
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + nums[i][j];
                }
            }
        }
        System.out.println(dp[num-1][num-1]);
    }
}
