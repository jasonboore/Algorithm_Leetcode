package leetcode.easy.normal;

import java.util.Arrays;

/**
 * 最长公共前缀
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        for (String str : strs) {
            if(str.equals("")){
                return "";
            }
        }
        char[] res = strs[0].toCharArray();
        for (int i = 1; i < strs.length; i++) {
            char[] chs = strs[i].toCharArray();
            int len = res.length < chs.length ? res.length : chs.length;
            int end = len;
            for (int j = 0; j < len; j++) {
                if(res[j] == chs[j]) {
                    continue;
                }else {
                    end = j;
                    break;
                }
            }
            res = Arrays.copyOf(res, end);
        }
        if(res.length == 0) {
            return "";
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));

    }
}
