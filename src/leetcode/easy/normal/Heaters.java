package leetcode.easy.normal;

import java.util.Arrays;

/**
 * 供暖器
 */
public class Heaters {
    public static int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int dis = 0;
        for (int house : houses) {
            int L = 0;
            int R = heaters.length - 1;
            int mid = (R - L) / 2 + L;
            while (R - L > 1) {
                if(house == heaters[mid]) {
                    L = mid;
                    R = mid;
                }else if(house > heaters[mid]) {
                    L = mid;
                }else {
                    R = mid;
                }
            }
            int curDis = Math.min(Math.abs(house - heaters[L]), Math.abs(heaters[R] - house));
            dis = Math.max(curDis, dis);
        }
        return dis;
    }


    public static void main(String[] args) {
        int[] houses = {1,2,3,5,15};
        int[] heaters = {2, 30};
        System.out.println(findRadius(houses, heaters));
    }
}
