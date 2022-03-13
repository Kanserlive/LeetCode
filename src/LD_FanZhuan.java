import java.util.Arrays;

public class LD_FanZhuan {
    public static void main(String[] args){
        int []num=new int[]{0,1,2,3,4,5};
        int i=1,j=4;
        System.out.println(Arrays.toString(reverse(num, i, j)));
    }

    public static int[] reverse(int[]num,int i,int j){
        for(int left=i,right=j;left<right;left++,right--){
            int temp=num[left];
            num[left]=num[right];
            num[right]=temp;
        }
        return num;
    }
}
