package leetcode.easy.normal;

/**
 * 反转字符串
 */
public class ReverseString {
    public void reverseString(char[] s) {
        if(s.length == 0) {
            return;
        }
        int L = 0, R = s.length - 1;
        while (L < R) {
            char temp = s[L];
            s[L++] = s[R];
            s[R--] = temp;
        }
    }
}
