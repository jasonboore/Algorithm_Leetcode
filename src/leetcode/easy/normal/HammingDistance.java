package leetcode.easy.normal;

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor != 0) {
            count++;
            xor &= (xor - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int x= 2, y = 4;
        System.out.println(hammingDistance(x, y));
    }
}
