package leetcode.easy.normal;

public class Base7 {
    public static String convertToBase7(int num) {
        if(num == 0) {
            return "0";
        }
        int n = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.insert(0, n % 7);
            n /= 7;
        }
        if(num < 0) {
            sb.insert(0, "-");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println(convertToBase7(num));
    }
}
