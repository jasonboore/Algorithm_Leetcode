package leetcode.easy.normal;

import java.util.HashMap;
import java.util.Map;

/**
 * 同构字符串
 */
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        return isIsomorphicHelp(s) .equals(isIsomorphicHelp(t)) ;
    }
    public static String isIsomorphicHelp(String s) {
        StringBuilder ans = new StringBuilder();
        int[] map = new int[128];
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if(map[s.charAt(i)] == 0) {
                map[s.charAt(i)] = count++;
            }
            ans.append(map[s.charAt(i)]);
        }
        return ans.toString();
    }

    public static boolean isIsomorphic1(String s, String t) {
        return isIsomorphicHelp1(s, t) && isIsomorphicHelp1(t, s);
    }
    public static boolean isIsomorphicHelp1(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            }else {
                if(map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "paper", t = "title";
        System.out.println(isIsomorphic(s, t));
    }
}
