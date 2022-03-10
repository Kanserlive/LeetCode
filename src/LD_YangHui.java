public class LD_YangHui {
     public static void main(String[] args)
     {
               int num = 5;
                 int[][] yangHui = new int [num][];
                 for(int i = 0; i < yangHui.length; i ++){
                      yangHui[i] = new int[i*2 + 1];
                 }
                 yangHui[0][0]=1;
                for(int i = 1; i < yangHui.length; i ++)
                       for(int j = 0; j < yangHui[i].length; j ++)
                      {
                         yangHui[i][0] = yangHui[i][2*i] = 1;
                         yangHui[i][1] = yangHui[i][i*2-1] = i;

                         if(i > 1 && j > 1 && j <2*i-1)
                           yangHui[i][j] = yangHui[i - 1][j-2] + yangHui[i -1][j -1] + yangHui[i - 1][j];
                       }
                 for(int i = 0; i < yangHui.length; i ++)
                     {
                       for(int j = 0; j < (num - i - 1) ; j ++)
                             System.out.print("\t");
                       for(int j = 0; j < yangHui[i].length; j ++)
                    System.out.print(yangHui[i][j] + "\t");

                       System.out.print("\n");
                     }
               }

}
