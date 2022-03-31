import java.util.Scanner;

public class LD_104 {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int []num=new int[N];
        for(int i=0;i<N;i++){
            num[i]=scan.nextInt();
        }
        int max=-1;
        int sum=0;
        int index=1;
        int per=1;
        int imax=0;
        int count=1;
        for (int i=0;i<N;i++){
            if((i+1)<=index){
                sum+=num[i];
            }else{
                if(sum>max){
                    imax=count;
                    max=sum;
                }
                sum=num[i];
                per=per*2;
                index=index+per;
                count++;
            }
        }
        if(sum>max){
            System.out.println(count);
        }else {
            System.out.println(imax);
        }
    }
}
