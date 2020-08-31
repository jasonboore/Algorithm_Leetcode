package leetcode.easy.normal;

/**
 * 赎金信
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] ran = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            ran[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            ran[magazine.charAt(i) - 'a']--;
        }
        for (int i : ran) {
            if(i > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "aa", b = "aab";
        System.out.println(canConstruct(a, b));
    }
}
