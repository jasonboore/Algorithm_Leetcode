package leetcode.medium.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String cur = s.substring(i, j + 1);
                if(!dp[j + 1] && set.contains(cur)) {
                    dp[j + 1] = dp[i];
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "catsandog";
        List<String> words = new ArrayList<>();
        words.add("cats");
        words.add("dog");
        words.add("sand");
        words.add("and");
        words.add("cat");
        System.out.println(wordBreak(s, words));
    }
}
