package leetcode.easy.normal;

/**
 *  反转字符串中的单词 III
 */
public class ReverseWordsinaStringIII {
    public static String reverseWords(String s) {
        if(s.length() < 2) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(s.length() - 1 - i));
        }
        String[] res = sb.toString().split(" ");
        sb.replace(0, sb.length(), "");
        for (int i = res.length - 1; i >= 0; i--) {
            sb.append(res[i] + " ");
        }
        String ans = sb.toString().substring(0, sb.length() - 1);
        return ans;
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
