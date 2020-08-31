package leetcode.easy.normal;

/**
 * 最长回文串
 */
public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        if(s.length() < 2) {
            return s.length();
        }
        int[] count = new int[128];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        int ans = 0;
        for (int i : count) {
            ans += i / 2 * 2;
            if(i % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
