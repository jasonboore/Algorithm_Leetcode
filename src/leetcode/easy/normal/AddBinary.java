package leetcode.easy.normal;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int add = 0;
        int i1 = a.length() - 1;
        int i2 = b.length() - 1;
        StringBuilder ans = new StringBuilder();
        while (i1 >= 0 || i2 >= 0) {
            int num1 = i1 >= 0 ? a.charAt(i1--) - '0' : 0;
            int num2 = i2 >= 0 ? b.charAt(i2--) - '0' : 0;
            int curNum = num1 + num2 + add;
            ans.append((char)(curNum % 2 + '0'));
            add = curNum / 2;
        }
        if(add == 1) {
            ans.append('1');
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a, b));
    }
}
