package leetcode.compititon2020;

import java.util.Arrays;

public class BreakfastCombine {
    public static int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);
        long count = 0;
        int s = 0;
        int d = drinks.length - 1;
        while (s < staple.length && d > -1) {
            if(staple[s] + drinks[d] <= x) {
                count += d + 1;
                s++;
            }else {
                d--;
            }
        }
        return (int) (count % 1000000007 == 0 ? count : count % 1000000007);
    }

    public static void main(String[] args) {
        int[] staple = {1}, drinks = {1};
        int x = 1;
        System.out.println(breakfastNumber(staple, drinks, x));
    }
}
