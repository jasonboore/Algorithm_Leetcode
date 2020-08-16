package leetcode.medium;

/**
 * 两数相加
 */

public class AddTwoNumbers {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    /**
     * 数值相加，数值范围有限，这个方法不好
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long times = 1L;
        long num1 = 0;
        long num2 = 0;
        while (l1 != null) {
            num1 += l1.val * times;
            l1 = l1.next;
            times *= 10;
        }
        times = 1L;
        while (l2 != null) {
            num2 += l2.val * times;
            l2 = l2.next;
            times *= 10;
        }
        long ans = num1 + num2;
        ListNode head = new ListNode((int) (ans % 10));
        ans /= 10;
        ListNode node = head;
        while (ans != 0) {
            node.next = new ListNode((int) (ans % 10));
            node = node.next;
            ans /= 10;
        }
        return head;
    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {

        int val = l1.val + l2.val;
        ListNode head = new ListNode(val % 10);
        int add = val / 10;
        ListNode node = head;

        l1 = l1 != null ? l1.next : null;
        l2 = l2 != null ? l2.next : null;
        while (l1 != null || l2 != null || add != 0) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            val = val1 + val2 + add;
            node.next = new ListNode(val % 10);
            node = node.next;
            add = val / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);


        ListNode l2 = new ListNode(1);
        ListNode node = l2;
        for (int i = 0; i < 9; i++) {
            node.next = new ListNode(9);
            node = node.next;
        }

        ListNode res = addTwoNumbers(l1, l2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
