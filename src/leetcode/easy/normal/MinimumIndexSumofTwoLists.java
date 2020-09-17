package leetcode.easy.normal;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 两个列表的最小索引总和
 */
public class MinimumIndexSumofTwoLists {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        ArrayList<String> list = new ArrayList<>();
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if(map.containsKey(list2[i])) {
                int index = i + map.get(list2[i]);
                if(index < sum) {
                    list.clear();
                    list.add(list2[i]);
                    sum = index;
                }else if(index == sum) {
                    list.add(list2[i]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] Andy = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] Doris = {"KFC", "Shogun", "Burger King"};
        for (String s : findRestaurant(Andy, Doris)) {
            System.out.println(s);
        }
    }
}
