import java.util.Arrays;
import java.util.Scanner;

public class LQ_276 {
    static int[] nums;
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        nums=new int[length];
        for(int i=0;i<length;i++){
            nums[i]=i+1;
        }
        int num=scan.nextInt();
        for (int j=0;j<num;j++){
            int ues=scan.nextInt();
            int range=scan.nextInt();
            if(ues==0){
                des(0,range-1,nums);
            }if(ues==1){
                inc(range-1,length,nums);
            }
        }
        for(int i=0;i<length;i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static int[] des(int start,int end,int[]nums){
        /*Arrays.sort(nums,start,end+1);
        for(int k=start,l=end;k<l;k++,l--){
            int temp=nums[k];
            nums[k]=nums[l];
            nums[l]=temp;*/
        for(int i=start;i<=end;i++){
            for (int j=i+1;j<=end;j++){
                if(nums[j]>nums[i]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }

    public static int[] inc(int start,int end,int[]nums){
        Arrays.sort(nums,start,end);
        return nums;
    }
}
