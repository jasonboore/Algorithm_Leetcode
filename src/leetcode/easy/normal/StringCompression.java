package leetcode.easy.normal;

/**
 * 压缩字符串
 */
public class StringCompression {
    public static int compress(char[] chars) {
        if(chars.length < 2) {
            return chars.length;
        }
        int index = 0, cursor = 0;
        char last = chars[0];
        while (cursor < chars.length) {
            int num = 0;
            while (cursor < chars.length && chars[cursor] == last) {
                num++;
                cursor++;
            }
            if(cursor < chars.length) {
                last = chars[cursor];
            }
            chars[index++] = chars[cursor - 1];
            if(num > 1) {
                for (char c : ("" + num).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }
}
