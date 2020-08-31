package leetcode.easy.normal;

import java.util.HashMap;
import java.util.Map;


/**
 * 有效的字母异位词
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i : count) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isAnagram_Advanced(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(map.containsKey(c)) {
                if(map.get(c) == 1) {
                    map.remove(c);
                }else {
                    map.put(c, map.get(c) - 1);
                }
            }
        }
        if(map.isEmpty()) {
            return true;
        }
        return false;
    }
}
