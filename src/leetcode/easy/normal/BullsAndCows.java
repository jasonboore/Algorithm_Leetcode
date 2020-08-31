package leetcode.easy.normal;

/**
 * 猜数字游戏
 */
public class BullsAndCows {
    public static String getHint(String secret, String guess) {
        int[] nums = new int[10];
        int cows = 0, bulls = 0;
        for (int i = 0; i < secret.length(); i++) {
            int sec = secret.charAt(i) - '0';
            int gue = guess.charAt(i) - '0';
            if(sec == gue) {
                bulls++;
            }else {
                if(nums[gue]-- > 0) {
                    cows++;
                }
                if(nums[sec]++ < 0) {
                    cows++;
                }
            }
        }
        return bulls + "A" + cows + "B";
    }

    public static void main(String[] args) {
        String secret = "1807", guess = "7810";
        System.out.println(getHint(secret, guess));
    }
}
