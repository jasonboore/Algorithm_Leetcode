package leetcode.easy.normal;

import java.util.Arrays;

/**
 * 分发饼干
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int count = 0;
        while (j < s.length && i < g.length) {
            if(g[i] <= s[j++]) {
                count++;
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
