package leetcode.easy.normal;

/**
 * 反转字符串 II
 */
public class ReverseStringII {
    public static String reverseStr(String s, int k) {
        if(k == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int index = 0;
        while (i < s.length()) {
            int count = k;
            while (i < s.length() && count-- > 0) {
                sb.insert(index, s.charAt(i++));
            }
            count = k;
            while (i < s.length() && count-- > 0) {
                sb.append(s.charAt(i++));
            }
            index += 2 * k;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = s = "abcdefg";
        System.out.println(reverseStr(s, 2));
    }
}
