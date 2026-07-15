package LinkedList;

// LeetCode 206: Reverse Linked List
public class Reverse206 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {

        ListNode last = null;
        ListNode temp = head;

        while (temp != null) {

            ListNode nextNode = temp.next;
            temp.next = last;
            last = temp;
            temp = nextNode;
        }

        return last;
    }
}
