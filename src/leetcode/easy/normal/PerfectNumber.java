package leetcode.easy.normal;

/**
 * 完美数
 */
public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        if(num == 1) {
            return false;
        }
        int count = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                count += i;
                if(i != num / i) count += num / i;
            }
        }
        return count == num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }
}
