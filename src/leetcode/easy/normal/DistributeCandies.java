package leetcode.easy.normal;

import java.util.HashSet;

/**
 * 分糖果
 */
public class DistributeCandies {
    public static int distributeCandies(int[] candies) {
        int kinds = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int candy : candies) {
            if(!set.contains(candy)) {
                set.add(candy);
                kinds++;
                if(kinds >= candies.length / 2) {
                    return candies.length / 2;
                }
            }
        }
        return kinds;
    }

    public static void main(String[] args) {
        int[] candies = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candies));
    }
}
