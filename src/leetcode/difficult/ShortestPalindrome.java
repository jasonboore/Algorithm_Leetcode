package leetcode.difficult;

/**
 * 最短回文串
 */
public class ShortestPalindrome {
    public static String shortestPalindrome(String s) {
        if(s.length() < 2) {
            return s;
        }

        int maxContainHead = -1;
        char[] manacherStr = getManacherStr(s);
        int len = manacherStr.length;
        int C = len;
        int L = len;
        int[] pArr = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            pArr[i] = L < i ? Math.min(pArr[2 * C - i], i - L) : 1;
            while (i + pArr[i] < len && i - pArr[i] > -1) {
                if(manacherStr[i + pArr[i]] == manacherStr[i - pArr[i]]) {
                    pArr[i]++;
                }else {
                    break;
                }
            }
            if(i - pArr[i] < L) {
                L = i - pArr[i];
                C = i;
            }
            if(L == -1) {
                maxContainHead = pArr[i] - 1;
                break;
            }
        }
        char[] res = new char[s.length() - maxContainHead];
        for (int i = 0; i < res.length; i++) {
            res[i] = manacherStr[len - 2 * i - 2];
        }
        return String.valueOf(res) + s;
    }

    private static char[] getManacherStr(String s) {
        char[] str = new char[s.length() * 2 + 1];
        int index = 0;
        for (int i = 0; i < str.length; i++) {
            str[i] = i % 2 == 0 ? '#' : s.charAt(index++);
        }
        return str;
    }

    public static void main(String[] args) {
        String s = "aabba";
        System.out.println(shortestPalindrome(s));
    }
}
