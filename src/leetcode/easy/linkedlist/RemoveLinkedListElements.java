package leetcode.easy.linkedlist;

/**
 * 移出链表元素
 */
public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if(head == null) {
            return null;
        }
        ListNode node = head.next;
        ListNode pre = head;
        while (node != null) {
            if(node.val == val) {
                pre.next = node.next;
            } else {
                pre = node;
            }
            node = node.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        ListNode node = head.next;
        node.next = new ListNode(6);
        node = node.next;
        node.next = new ListNode(3);
        node = node.next;
        node.next = new ListNode(4);
        node = node.next;
        node.next = new ListNode(1);
        node = node.next;
        node.next = new ListNode(6);
        head = removeElements(head, 1);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
