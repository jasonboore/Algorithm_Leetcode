package leetcode.easy;
/**
 * 有效的括号
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if(s.equals("") || s.length() == 0 || s == null) {
            return true;
        }
        if(s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        char[] chs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chs.length; i++) {
            char ch = chs[i];
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }else {
                if(stack.empty() || stack.pop() != map.get(ch)) {
                    return false;
                }
            }
        }
        if(stack.empty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid(s));
    }
}
