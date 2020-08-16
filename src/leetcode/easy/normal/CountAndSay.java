package leetcode.easy.normal;

/**
 * 外观数列
 */
public class CountAndSay {
    public static String countAndSay(int n) {
        if( n == 1) {
            return "1";
        }
        String ans = "1";
        for (int i = 2; i <= n; i++) {
            int j = 0;
            StringBuilder sb = new StringBuilder();
            while (j < ans.length()){
                int curNum = 0;
                char c = ans.charAt(j);
                while (j < ans.length() && ans.charAt(j) == c) {
                    curNum++;
                    j++;
                }
                sb.append(curNum + "").append(c);
            }
            ans = sb.toString();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
}
