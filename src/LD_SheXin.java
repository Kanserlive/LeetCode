public class LD_SheXin {
    public  static  void  main(String[] args){
        int num=5;
        int[][]sb=new int[num][];
        for(int i=0;i<num;i++){
            sb[i]=new int[num-i];
        }
        for(int i=0;i<num;i++){
            for (int j=0;j<sb[i].length;j++){
                sb[i][0]=(i+1)*i/2+1;
                if(j>0){
                    sb[i][j]=sb[i][j-1]+i+j+1;
                }
            }
        }
        for(int i = 0; i < sb.length; i ++)
        {
            for(int j = 0; j < sb[i].length; j ++)
                System.out.print(sb[i][j] + "\t");

            System.out.print("\n");
        }
    }
}
