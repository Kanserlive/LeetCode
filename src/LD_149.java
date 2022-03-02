public class LD_149 {
    class Solution {
        public int maxPoints(int[][] points) {
            if(points.length<=2){
                return points.length;
            }
            int res=0;
            for(int i=0;i<points.length-2;i++){
                for(int j=i+1;j<points.length-1;j++){
                    int count=2;
                    int x1=points[i][0]-points[j][0];
                    int y1=points[i][1]-points[j][1];
                    for(int k=j+1;k<points.length;k++){
                        int x2=points[j][0]-points[k][0];
                        int y2=points[j][1]-points[k][1];
                        if(x1*y2==x2*y1){
                            count++;
                        }
                    }
                    res=Math.max(res,count);
                }
            }
            return res;
        }
    }
}
