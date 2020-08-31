package leetcode.easy.normal;

import java.util.HashMap;

/**
 * 单词规律
 */
public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> pat = new HashMap<>();
        HashMap<String, Character> stringHashMap = new HashMap<>();
        String[] strs = str.split(" ");
        if(pattern.length() != strs.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if(!(pat.containsKey(c) || stringHashMap.containsKey(strs[i]))) {
                pat.put(c, strs[i]);
                stringHashMap.put(strs[i], c);
            }else {
                if(pat.containsKey(c)
                        && stringHashMap.containsKey(strs[i])
                        && pat.get(c).equals(strs[i])) {
                    continue;
                }
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "aaaa", str = "dog cat cat dog";
        System.out.println(wordPattern(pattern, str));
    }
}
