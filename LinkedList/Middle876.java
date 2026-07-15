package LinkedList;

/**
 * LeetCode 876: Middle of the Linked List
 * Returns the middle node of a singly linked list. If there are two middles, returns the second one.
 */
public class Middle876 {
    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * Finds the middle node of the list.
     * @param head the head of the singly linked list
     * @return the middle ListNode
     */
    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        // Two-pointer technique: slow moves 1 step, fast moves 2 steps.
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
