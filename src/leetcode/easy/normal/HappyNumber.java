package leetcode.easy.normal;

/**
 * 快乐数
 */
public class HappyNumber {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }
    public static int getNext(int n) {
        int ans = 0;
        while (n > 0) {
            ans += (n % 10) * (n % 10);
            n /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(116));
    }
}
