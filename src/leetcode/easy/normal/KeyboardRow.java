package leetcode.easy.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * 键盘行
 */
public class KeyboardRow {
    public static String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            boolean flag = true;
            if(word.length() <= 1) {
                list.add(word);
                continue;
            }
            int line = getLine(word.charAt(0));
            for (int i = 1; i < word.length(); i++) {
                if(getLine(word.charAt(i)) != line) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                list.add(word);
            }
        }
        return list.toArray(new String[list.size()]);
    }
    public static int getLine(char c) {
        c = Character.toLowerCase(c);
        if("qwertyuiop".indexOf(c) != -1) {
            return 1;
        }else if("asdfghjkl".indexOf(c) != -1) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {
        String[] strs = {"Hello", "Alaska", "Dad", "Peace"};
        for (String word : findWords(strs)) {
            System.out.println(word);
        }
    }
}
