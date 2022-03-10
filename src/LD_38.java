public class LD_38 {
    class Solution {
        public String countAndSay(int n) {
            if (n == 1) return "1";
            else {
                String lastStr = countAndSay(n - 1);
                StringBuilder ans = new StringBuilder();
                int i = 0, j = 1, len = lastStr.length();
                while (j < len) {
                    if (lastStr.charAt(i) != lastStr.charAt(j)) {
                        ans.append(j - i).append(lastStr.charAt(i));
                        i = j;
                    }
                    j++;
                }
                ans.append(j - i).append(lastStr.charAt(i));
                return ans.toString();
            }
        }
    }
}
