import java.util.ArrayList;
import java.util.List;

public class LD_438 {
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> ans = new ArrayList<>();
            int n=s.length(),m=p.length();
            int[]cnt=new int[26];
            for(int i=0;i<m;i++){
                cnt[p.charAt(i) - 'a']++;//将P的各个字符数写入cnt[]中
            }
            int a=0;
            for(int i=0;i<26;i++){
                if(cnt[i]!=0){
                    a++;//将P的字符种类数统计出来，为之后与S的对比相等做铺垫
                }
            }
            for(int left=0,right=0,b=0;right<n;right++){
                //先自减1的结果如果为0，则说明之前为1，滑动窗口增加了一个和p相同的字符，
                if(--cnt[s.charAt(right) - 'a']==0){
                    b++;
                }
                //右指针超出滑动窗口长度之后，先自加1，若为1，说明之前为0，是经过自减1后得到的0，所以滑动窗口减小了一个和p相同的字符，
                if(right-left+1>m&&++cnt[s.charAt(left++) - 'a']==1){
                    b--;
                }
                //最后如果a,b相等，则滑动窗口和p相等。
                if(a==b){
                    ans.add(left);
                }
            }
            return ans;

        }
    }

    class Solution2 {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> ans = new ArrayList<>();
            int n = s.length(), m = p.length();
            int[] c1 = new int[26], c2 = new int[26];
            for (int i = 0; i < m; i++) c2[p.charAt(i) - 'a']++;
            for (int l = 0, r = 0; r < n; r++) {
                c1[s.charAt(r) - 'a']++;
                if (r - l + 1 > m) c1[s.charAt(l++) - 'a']--;
                if (check(c1, c2)) ans.add(l);
            }
            return ans;
        }
        boolean check(int[] c1, int[] c2) {
            for (int i = 0; i < 26; i++) {
                if (c1[i] != c2[i]) return false;
            }
            return true;
        }
    }


}
