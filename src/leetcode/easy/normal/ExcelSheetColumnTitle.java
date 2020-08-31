package leetcode.easy.normal;

/**
 *
 * Excel表列名称
 */
public class ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int c = n % 26;
            if(c == 0){
                c = 26;
                n -= 26;
            }
            sb.insert(0, (char) ('A' + c - 1));
            n /= 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
}
