package leetcode.easy.normal;

/**
 * 检测大写字母
 */
public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        if(word.length() < 2) {
            return true;
        }
        if(word.length() == 2) {
            return !(isLowWord(word.charAt(0)) && isUpWord(word.charAt(1)));
        }
        char[] chs = word.toCharArray();
        int n = chs.length;
        if(isUpWord(chs[0])) {
            if(isUpWord(chs[1])) {
                return isValid(2, n, false, chs);
            }else {
                return isValid(2, n, true, chs);
            }
        }else {
            return isValid(1, n, true, chs);
        }
    }
    public static boolean isValid(int start, int n, boolean flag, char[] chs) {
        for (int i = start; i < n; i++) {
            if(flag && !isLowWord(chs[i])) {
                return false;
            }
            if(!flag && !isUpWord(chs[i])) {
                return false;
            }
        }
        return true;
    }
    public static boolean isUpWord(char c) {
        return c >= 'A' && c <= 'Z';
    }
    public static boolean isLowWord(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static void main(String[] args) {
        String s = "Aa";
        System.out.println(detectCapitalUse(s));
    }
}
