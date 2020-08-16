package leetcode.medium;

/**
 *  字符串转换整数 (atoi)
 */
public class StringtoInteger {
    public static int myAtoi(String str) {
        String s = splitK(str);
        int res;
        boolean flag = false;
        if(s.length() != 0
                && (s.charAt(0) == '-'
                || s.charAt(0) == '+'
                || (s.charAt(0) >= '0' && s.charAt(0) <= '9'))) {
             res = s.charAt(0) != '-' && s.charAt(0) != '+' ? s.charAt(0) - '0' : 0;
        }else {
            return 0;
        }
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c <= '9' && c >= '0'){
                int pop = c - '0';
                if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && pop > 7)) {
                    res = Integer.MAX_VALUE;
                    flag = true;
                    break;
                }
                res = res * 10 + pop;
            } else {
                break;
            }
        }
        if(s.charAt(0) == '-') {
            if(res == Integer.MAX_VALUE && flag) {
                res = Integer.MIN_VALUE;
            }else {
                res = -res;
            }

        }
        return res;
    }
    public static String splitK(String str) {
        int i = 0;
        for (; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                break;
            }
        }
        if(i == str.length()) {
            return "";
        }
        return str.substring(i);
    }

    public static void main(String[] args) {
        String s = "-91283472332";
        System.out.println(myAtoi(s));
    }
}
