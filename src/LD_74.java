public class LD_74 {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m=matrix.length,n=matrix[0].length;
            int left=-1,right=m;
            int mid_1=0;
            while(left+1!=right){
                int mid=left+(right-left)/2;
                mid_1=mid;
                if(matrix[mid][0]==target){
                    return true;
                }
                else if(matrix[mid][0]<target){
                    left=mid;
                }else if(matrix[mid][0]>target){
                    right=mid;
                }
            }
            int star=0;
            if(left==-1){
                star=mid_1;
            }else{
                star=left;
            }
            left=-1;
            right=n;
            while(left+1!=right){
                int mid=left+(right-left)/2;
                if(matrix[star][mid]==target){
                    return true;
                }
                else if(matrix[star][mid]<target){
                    left=mid;
                }else if(matrix[star][mid]>target){
                    right=mid;
                }
            }
            return false;

        }
    }
}
