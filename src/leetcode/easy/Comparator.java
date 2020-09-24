package leetcode.easy;

public class Comparator {
    public int[] comparator(int size, int value) {
        int[] nums = new int[(int) (Math.random() * (size + 1))];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * (value + 1) - (int) (Math.random() * size));
        }
        return nums;
    }

    public static void main(String[] args) {
        Comparator comparator = new Comparator();
        for (int i : comparator.comparator(10, 10)) {
            System.out.println(i);
        }
    }
}
