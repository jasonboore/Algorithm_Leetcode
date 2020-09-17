package leetcode.easy.normal;

public class RepeatedSubstringPattern {
    /**
     * KMP算法证明s是否是s+s的子串
     * @param s
     * @return
     */
    public static boolean repeatedSubstringPattern(String s) {
        int res = KMP(s, s + s);
        return res != -1 && res != s.length();
    }
    public static int KMP(String s, String t) {
        if(s.length() < 2) {
            return -1;
        }
        int[] next = getNext(s);
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int i1 = 1;
        int i2 =0;
        while (i1 < t.length() && i2 < s.length()) {
            if(tt[i1] == ss[i2]) {
                i1++;
                i2++;
            }else if(next[i2] == -1) {
                i1++;
            }else {
                i2 = next[i2];
            }
        }
        return i2 == s.length() ? i1 - i2 : -1;
    }

    /**
     * 证明s.length()是否是n - next[n - 1]的倍数
     * 优化版
     * @param s
     * @return
     */
    public static boolean repeatedSubstringPattern1(String s) {
        if(s.length() < 2) {
            return false;
        }
        int n =s.length();
        int[] next = getNext(s);
        return next[n] != 0 && n % (n - next[n]) == 0;
    }
    private static int[] getNext(String s) {
        int len = s.length();
        //int[] next = new int[len;//KMP正常求next数组
        int[] next = new int[len + 1];//针对本题
        char [] chs = s.toCharArray();
        next[0] = -1;
        next[1] = 0;
        int cn = 0;
        int i = 2;
        while (i < len + 1) {
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
        String s = "abababa";
        System.out.println(repeatedSubstringPattern1(s));
    }
}
