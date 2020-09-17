package leetcode.compititon2020;

public class CalRebot {
    public static int calculate(String s) {
        int x = 1, y = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'A') {
                x = 2 * x + y;
            }else {
                y = 2 * y + x;
            }
        }
        return x + y;
    }

    public static void main(String[] args) {
        String s = "AB";
        System.out.println(calculate(s));
    }
}
