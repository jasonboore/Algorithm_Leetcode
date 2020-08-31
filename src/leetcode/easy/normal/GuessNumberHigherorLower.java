package leetcode.easy.normal;

/**
 * 猜数字大小
 */
public class GuessNumberHigherorLower {
    public int guessNumber(int n) {
        int L = 1, R = n;
        while (L <= R) {
            int mid = L + (R - L) / 2;
            int gue = guess(mid);
            if(gue == 0) {
                return mid;
            }else if(gue > 0) {
                L = mid + 1;
            }else {
                R = mid - 1;
            }
        }
        return -1;
    }
    public int guess(int num) {
        //TODO return 	     -1 if num is lower than the guess number
        // *			      1 if num is higher than the guess number
        // *               otherwise return 0
        return 0;
    }
}
