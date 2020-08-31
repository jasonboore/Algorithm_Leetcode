package leetcode.easy.normal;

/**
 * Excel表列序号
 */
public class ExcelSheetColumnNumber {
    public static int titleToNumber(String s) {
        if(s == null) {
            return 0;
        }
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            number = number * 26 + (s.charAt(i) - 'A' + 1);
        }
        return number;
    }

    public static void main(String[] args) {
        String s = "ZY";
        System.out.println(titleToNumber(s));
    }
}
