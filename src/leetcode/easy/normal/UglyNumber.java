package leetcode.easy.normal;

/**
 * 丑数
 */
public class UglyNumber {
    public static boolean isUgly(int num) {
        if(num < 2) {
            return true;
        }
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }
}
