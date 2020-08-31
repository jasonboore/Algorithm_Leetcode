package leetcode.easy.normal;

/**
 * 数字转换为十六进制数
 */
public class ConvertaNumbertoHexadecimal {
    public static String toHex(int num) {
        if(num == 0) {
            return "0";
        }
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int index = num & 15;
            sb.insert(0, hex[index]);
            num = num >>> 4;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toHex(-1));
    }
}
