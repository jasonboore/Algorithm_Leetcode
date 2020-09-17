package leetcode.easy.normal;

/**
 * 最长特殊序列 Ⅰ
 */
public class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }

    public static void main(String[] args) {

    }
}
