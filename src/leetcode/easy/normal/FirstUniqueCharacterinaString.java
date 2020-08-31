package leetcode.easy.normal;

/**
 * 字符串中的第一个唯一字符
 */
public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        if(s.length() == 0) {
            return -1;
        }
        int[] note = new int[26];
        for (int i = 0; i < s.length(); i++) {
            note[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(note[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
