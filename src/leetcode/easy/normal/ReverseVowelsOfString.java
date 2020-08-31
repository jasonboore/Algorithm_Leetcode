package leetcode.easy.normal;


/**
 * 反转字符串中的元音字母
 */
public class ReverseVowelsOfString {
    public static String reverseVowels(String s) {
        if(s.length() == 0) {
            return s;
        }
        char[] chs = s.toCharArray();
        int L = 0, R = chs.length - 1;
        while (L < R) {
            while (L < chs.length && !isVowel(chs[L])) L++;
            while (R > -1 && !isVowel(chs[R])) R--;
            if(L >= R) break;
            char temp = chs[L];
            chs[L] = chs[R];
            chs[R] = temp;
            L++;
            R--;
        }
        return new String(chs);
    }
    public static boolean isVowel(char c) {
        return c == 'a'
                || c == 'e'
                || c == 'i'
                || c == 'o'
                || c == 'u'
                || c == 'A'
                || c == 'E'
                || c == 'I'
                || c == 'O'
                || c == 'U';
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
