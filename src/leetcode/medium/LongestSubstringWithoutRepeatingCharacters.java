package leetcode.medium;
/**
 * 无重复字符的最长子串
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> characters = new HashSet<>();
        int maxLength = 0;
        int L = 0;
        int R = 0;
        while (R < s.length()) {
            char c = s.charAt(R);
            if(characters.contains(c)) {
                maxLength = Math.max(R - L, maxLength);
                characters.remove(s.charAt(L));
                L++;
                continue;
            }
            characters.add(c);
            maxLength = Math.max(R - L + 1, maxLength);
            R++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
