package leetcode.easy;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNum = 0;
        while (x > revertedNum) {
            revertedNum = revertedNum * 10 + x % 10;
            x /= 10;
        }
        return revertedNum == x || x == revertedNum / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));
    }
}
