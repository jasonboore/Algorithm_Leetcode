package leetcode.easy.normal;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean divByThree = (i % 3) == 0;
            boolean divByFive = (i % 5) == 0;
            if(divByFive && divByThree) {
                list.add("FizzBuzz");
            }else if(divByThree) {
                list.add("Fizz");
            }else if(divByFive) {
                list.add("Buzz");
            }else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
