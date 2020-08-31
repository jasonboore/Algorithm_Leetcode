package leetcode.easy.linkedlist;

/**
 * 删除排序链表中的重复元素
 */
public class RemoveDuplicatesFromSortedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode node = head.next;
        ListNode pre = head;
        while (node != null) {
            if(node.val == pre.val) {
                pre.next = node.next;
            }else {
                pre = node;
            }
            node = node.next;
        }
        return head;
    }

}
