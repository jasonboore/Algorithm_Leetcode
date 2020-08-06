package leetcode.easy;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        char[] numArr1 = num1.toCharArray();
        char[] numArr2 = num2.toCharArray();
        int index1 = numArr1.length - 1;
        int index2 = numArr2.length - 1;
        int add = 0;
        StringBuffer ans = new StringBuffer();
        while (index1 >= 0 || index2 >= 0 || add != 0) {
            int i = index1 >= 0 ? numArr1[index1] - '0' : 0;
            int j = index2 >= 0 ? numArr2[index2] - '0' : 0;
            int result = i + j + add;
            ans.append(result % 10);
            add = result / 10;
            index1--;
            index2--;
        }
        ans.reverse();
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("1", "9"));
    }
}
