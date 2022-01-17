import java.util.Arrays;
/*
判断s2是否包含s1的各种形态子类，等效于s1中各个字母的个数是否和S2的窗口中的相等。
先将S1各个字母的个数情况存在cnt1中，S2的前N个字母存在cnt2中；
如果cnt1=cnt2则相等；
然后cnt2就进行窗口向右平移，知道相等退出。
*/
public class LD_567 {
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            int n = s1.length(), m = s2.length();
            if (n > m) {
                return false;
            }
            int[] cnt1 = new int[26];
            int[] cnt2 = new int[26];
            for (int i = 0; i < n; i++) {
                ++cnt1[s1.charAt(i) - 'a'];
                ++cnt2[s2.charAt(i) - 'a'];
            }
            if (Arrays.equals(cnt1, cnt2)) {
                return true;
            }
            for (int i = n; i < m; i++) {
                ++cnt2[s2.charAt(i) - 'a'];
                --cnt2[s2.charAt(i - n) - 'a'];
                if (Arrays.equals(cnt1, cnt2)) {
                    return true;
                }

            }
            return false;
        }
    }
/*
双指针方法
将S1各个字母的个数全置为负数，写入cnt中
S2的left指针为0，right向右推移，不断加入新数，当cnt为正是，说明指针内区间数多了，left指针要向右移动
当cnt为非正，且双指针内长度等于n（s1长度）时，s1为s2的子类。
*/
    class Solution2 {
        public boolean checkInclusion(String s1, String s2) {
            int n = s1.length(), m = s2.length();
            if (n > m) {
                return false;
            }
            int[] cnt = new int[26];
            for (int i = 0; i < n; ++i) {
                --cnt[s1.charAt(i) - 'a'];
            }
            int left = 0;
            for (int right = 0; right < m; ++right) {
                int x = s2.charAt(right) - 'a';
                ++cnt[x];
                while (cnt[x] > 0) {
                    --cnt[s2.charAt(left) - 'a'];
                    ++left;
                }
                if (right - left + 1 == n) {
                    return true;
                }
            }
            return false;
        }
    }
}
