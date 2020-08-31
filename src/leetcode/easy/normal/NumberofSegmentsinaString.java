package leetcode.easy.normal;
/**
 * 字符串中的单词数
 */
public class NumberofSegmentsinaString {
    public static int countSegments(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int segment = 0;
        int i = 0;
        while (i < s.length()){
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            while (i < s.length() && s.charAt(i) != ' ') {
                i++;
            }
            if(s.charAt(i - 1) != ' ')
                segment++;
        }
        return segment;
    }

    public static void main(String[] args) {
        String s = "          ";
        System.out.println(countSegments(s));
    }
}
