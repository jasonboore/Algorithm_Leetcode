package leetcode.easy.normal;

/**
 * 找不同
 */
public class FindtheDifference {
    public static char findTheDifference(String s, String t) {
        if(s.length() == 0) {
            return t.charAt(0);
        }
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res ^= s.charAt(i);
            res ^= t.charAt(i);
        }
        res ^= t.charAt(t.length() - 1);
        return (char)res;
    }

    public static void main(String[] args) {
        String s = "abcd" ,t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
}
