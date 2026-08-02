package LinkedList;

import LinkedList.Cycle141.ListNode;

public class Palindrome234 {
    
 
    public ListNode middleNode(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while (s != null && s.next != null) {
            f = f.next;
            s = s.next.next;
        }
        return f;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        ListNode middle = middleNode(head);
        middle = reverse(middle);

        while (middle != null) {
            if (head.val != middle.val) {
                return false;
            }
            head = head.next;
            middle = middle.next;
        }

        return true;

    }
}
 
