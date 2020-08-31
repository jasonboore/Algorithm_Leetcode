package leetcode.easy.linkedlist;

/**
 * 回文链表
 */
public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode firstHalfEnd = firstHalfEnd(head);
        ListNode secondHalfFirst = reverseList(firstHalfEnd.next);
        ListNode p1 = head;
        ListNode p2 = secondHalfFirst;
        boolean res = true;
        while (p2 != null) {
            if(p1.val != p2.val) {
                res = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        reverseList(secondHalfFirst);
        return res;
    }
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode node = head;
        ListNode next;
        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
    public static ListNode firstHalfEnd(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        System.out.println(isPalindrome(head));
    }
}
