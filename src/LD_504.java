public class LD_504 {
    class Solution {
        public String convertToBase7(int num) {
            if(num==0){
                return "0";
            }
            boolean is=num<0;
            if(is){
                num=-num;
            }
            StringBuilder ans=new StringBuilder();
            while(num>0){
                int a=num%7;
                num=num/7;
                ans.append(a);
            }
            ans.reverse();
            return is ?"-"+ans.toString():ans.toString();

        }
    }
}
