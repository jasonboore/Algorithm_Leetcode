package leetcode.medium;

public class LongestPalindromicSubstring {
    public static char[] manacherString(String s){
        char[] chs = s.toCharArray();
        char[] manacherchs = new char[2 * s.length() + 1];
        int index = 0;
        for (int i = 0; i < manacherchs.length; i++) {
            manacherchs[i] = (i & 1) == 0 ? '#' : chs[index++];
        }
        return manacherchs;
    }
    public static String longestPalindrome(String s) {
        if(s == null && s.length() == 0) {
            return "";
        }
        char[] chs = manacherString(s);
        int[] pArr = new int[chs.length];
        int start = 0;
        int max = Integer.MIN_VALUE;
        int C = -1;
        int R = -1;
        for (int i = 0; i < chs.length; i++) {
            pArr[i] = R > i ? Math.min(pArr[2 * C - i], R - i) : 1;
            while (i + pArr[i] < chs.length && i - pArr[i] > -1) {
                if(chs[i + pArr[i]] == chs[i - pArr[i]]){
                    pArr[i]++;
                }else {
                    break;
                }
            }
            if(i + pArr[i] > R) {
                C = i;
                R = i + pArr[i];
            }
            if(pArr[i] > max) {
                max = pArr[i];
                start = (int) Math.ceil((i - pArr[i]) * 1.0 / 2);
            }
        }
        return s.substring(start, start + max - 1);
    }

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
}
