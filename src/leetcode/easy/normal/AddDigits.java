package leetcode.easy.normal;

/**
 *  各位相加
 */
public class AddDigits {
    public static int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(19));
    }
}
