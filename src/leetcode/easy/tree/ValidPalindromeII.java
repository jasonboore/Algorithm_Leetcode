package leetcode.easy.tree;

/**
 * 验证回文字符串 Ⅱ
 */
public class ValidPalindromeII {
    public static boolean validPalindrome(String s) {
        if(s.length() < 2) {
            return true;
        }
        return process(s, 0, s.length() - 1, true);
    }
    public static boolean process(String s, int L, int R, boolean flag) {
        if(L >= R) {
            return true;
        }
        if(s.charAt(L) == s.charAt(R)) {
            return process(s, L + 1, R - 1, flag);
        }
        if(!flag) {
            return false;
        }
        return process(s, L + 1, R, false) || process(s, L, R - 1, false);
    }
    public static boolean validPalindrome1(String s) {
        if(s.length() < 2) {
            return true;
        }
        int L = 0;
        int R = s.length() - 1;
        while (L < R) {
            char left = s.charAt(L);
            char right = s.charAt(R);
            if (left == right) {
                L++;
                R--;
            }else {
                boolean flag1 = true;
                boolean flag2 = true;
                for (int i = L + 1, j = R; i < j; i++, j--) {
                    if(s.charAt(i) != s.charAt(j)) {
                        flag1 = false;
                    }
                }
                for (int i = L, j = R - 1; i < j; i++, j--) {
                    if(s.charAt(i) != s.charAt(j)) {
                        flag2 = false;
                    }
                }
                return flag1 || flag2;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }
}
