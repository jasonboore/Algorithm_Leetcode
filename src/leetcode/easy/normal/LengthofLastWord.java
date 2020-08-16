package leetcode.easy.normal;

public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
      int end = s.length() - 1;
      while (end > -1 && s.charAt(end) == ' ') end--;
      if(end < 0) {
          return 0;
      }
      int start = end;
      while (start > -1 && s.charAt(start) != ' ') start--;
      return end - start;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
