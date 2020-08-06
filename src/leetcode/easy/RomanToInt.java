package leetcode.easy;

/**
 * 罗马数字转整数
 */
public class RomanToInt {
    public static int romanToInt(String s){
        int num = 0;
        char[] chs = s.toCharArray();
        int len = chs.length;
        for (int i = 0; i < len; i++) {
            switch (chs[i]){
                case 'I':
                    if(i + 1 < len && chs[i + 1] == 'V') {
                        i++;
                        num += 4;
                    }else if(i + 1 < len && chs[i + 1] == 'X'){
                        num += 9;
                        i++;
                    }else {
                        num += 1;
                    }
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    if(i + 1 < len && chs[i + 1] == 'L') {
                        i++;
                        num += 40;
                    }else if(i + 1 < len && chs[i + 1] == 'C'){
                        num += 90;
                        i++;
                    }else {
                        num += 10;
                    }
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    if(i + 1 < len && chs[i + 1] == 'D') {
                        i++;
                        num += 400;
                    }else if(i + 1 < len && chs[i + 1] == 'M'){
                        num += 900;
                        i++;
                    }else {
                        num += 100;
                    }
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
