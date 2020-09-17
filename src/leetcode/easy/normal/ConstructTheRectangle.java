package leetcode.easy.normal;

/**
 * 构造矩形
 */
public class ConstructTheRectangle {
    public static int[] constructRectangle(int area) {
        int L = area;
        int W = 1;
        for (int i = 2; i <= Math.sqrt(area); i++) {
            if(area % i == 0) {
                W = i;
                L = area / i;
            }
        }
        return new int[] {L, W};
    }

    public static void main(String[] args) {
        int num = 50;
        for (int i : constructRectangle(num)) {
            System.out.println(i);
        }
    }
}
