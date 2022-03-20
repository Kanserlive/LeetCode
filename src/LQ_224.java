import java.util.Scanner;

public class LQ_224 {
    public static void main(String []args){
        Scanner sca=new Scanner(System.in);
        int num=sca.nextInt();
        int sum=0;
        int max=-1;
        int min=999;
        double per;
        for(int i=0;i<num;i++){
            int sb=sca.nextInt();
            sum+=sb;
            max=max>sb?max:sb;
            min=min<sb?min:sb;
        }
        System.out.println(max);
        System.out.println(min);
        double num_1=num;
        per=sum/num_1;
        double per_1=Math.round(per*100)*0.01d;
        System.out.println(per_1);
        /*System.out.println(String.format("%.2f",per));*/
    }
}
