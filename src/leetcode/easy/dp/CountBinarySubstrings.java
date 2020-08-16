package leetcode.easy.dp;

/**
 * 计数二进制子串
 */
public class CountBinarySubstrings {
    public static int countBinarySubstrings(String s) {
        int result = 0;
        int last = 0;
        int length = s.length();
        int p = 0;
        while (p < length){
            char c = s.charAt(p);
            int count = 0;
            while (p < length && s.charAt(p) == c) {
                p++;
                count++;
            }
            result += Math.min(count, last);
            last = count;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "10101";
        System.out.println(countBinarySubstrings(s));
    }
}
