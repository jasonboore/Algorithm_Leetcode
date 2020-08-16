package leetcode.easy.normal;

/**
 * 验证回文串
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if(s == null) {
            return true;
        }
        s = s.toLowerCase();
        int head = 0;
        int tail = s.length() - 1;
        while (head <= tail) {
            if(!isValid(s.charAt(head))) {
                head++;
                continue;
            }
            if(!isValid(s.charAt(tail))) {
                tail--;
                continue;
            }
            if(s.charAt(head) == s.charAt(tail)) {
                head++;
                tail--;
                continue;
            }
            return false;
        }
        return true;
    }
    public static boolean isValid(char c) {
        return horizen('a', 'z', c) || horizen('0', '9', c);
    }

    public static boolean horizen(char a, char b, char cur) {
        return cur >= a && cur <= b;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
