package leetcode.easy.normal;

/**
 * 种花问题
 */
public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int num = 0;
        int len = flowerbed.length;
        while (i < flowerbed.length) {
            while (i < len && flowerbed[i] == 1) {
                i++;
            }
            int cur = i++ == 0 ? 1 : 0;
            while (i < flowerbed.length && flowerbed[i] == 0) {
                cur++;
                i++;
            }
            cur = i == flowerbed.length ? cur : cur - 1;
            num += Math.ceil(cur * 1.0 / 2);
            if(num >= n) {
                return true;
            }
        }
        return false;
    }
    public static boolean canPlaceFlowers1(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == len - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            if(count >= n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] flowered = {1,0,0,0,0,1};
        System.out.println(canPlaceFlowers(flowered, 2));
    }
}
