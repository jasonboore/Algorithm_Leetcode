package leetcode.easy;

/**
 * 实现 strStr()
 */
public class strStr_KMP {
    public static int strStr(String haystack, String needle) {
        if(haystack.length() == 0 || haystack.length() < needle.length()) {
            return -1;
        }
        if(needle.length() == 0) {
            return 0;
        }
        int[] next = getNextArray(needle);
        int i1 = 0;
        int i2 = 0;
        while (i1 < haystack.length() && i2 < needle.length()) {
            if(haystack.charAt(i1) == needle.charAt(i2)) {
                i1++;
                i2++;
            }else if(next[i2] == -1) {
                i1++;
            }else {
                i2 = next[i2];
            }
        }
        return i2 == needle.length() ? i1 - i2 : -1;
    }
    public static int[] getNextArray(String str) {
        if(str.length() == 1) {
            return new int[]{ - 1};
        }
        char[] chs = str.toCharArray();
        int[] next = new int[str.length()];
        next[0] = -1;
        next[1] = 0;
        int i = 2;
        int cn = 0;
        while (i < str.length()) {
            if(chs[i - 1] == chs[cn]) {
                next[i++] = ++cn;
            }else if(cn > 0) {
                cn = next[cn];
            }else {
                next[i++] = 0;
            }
        }
        return next;
    }

    public static void main(String[] args) {
        String  haystack = "", needle = "";
        System.out.println(strStr(haystack, needle));
    }
}
