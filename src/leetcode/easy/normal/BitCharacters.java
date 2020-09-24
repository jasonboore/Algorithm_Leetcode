package leetcode.easy.normal;

/**
 *  1比特与2比特字符
 */
public class BitCharacters {
    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }

    public static void main(String[] args) {
        int[] bits = {1, 1, 0};
        System.out.println(isOneBitCharacter(bits));
    }
}
