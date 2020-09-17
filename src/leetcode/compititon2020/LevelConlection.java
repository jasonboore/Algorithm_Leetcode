package leetcode.compititon2020;

import java.util.ArrayList;
import java.util.List;

public class LevelConlection {
    public static int minimumOperations(String leaves) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < leaves.length()) {
            char c = leaves.charAt(i);
            int cur = 0;
            while (i < leaves.length() && leaves.charAt(i) == c) {
                cur++;
                i++;
            }
            list.add(cur);
        }
        char start = leaves.charAt(0);
        char end = leaves.charAt(leaves.length() - 1);
        int res = 0;
        if(start == 'y' && end == 'y') {
            for (int j = 1; j < list.size() - 1; j++) {
                if(j % 2 == 1) {
                    res += list.get(j);
                }
            }
            res += 2;
        }else if(start == 'y') {
            for (int j = 1; j < list.size() - 1; j++) {
                if(j % 2 == 1) {
                    res += list.get(j);
                }
            }
            res += 1;
        }else if(end == 'y') {

            for (int j = 2; j < list.size() - 1; j++) {
                if(j % 2 == 0) {
                    res += list.get(j);
                }
            }
            res += 1;
        }else {
            for (int j = 1; j < list.size() - 1; j++) {
                if(j % 2 == 0) {
                    res += list.get(j);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "rrryyyrryyyrr";
        System.out.println(minimumOperations(s));
    }
}
