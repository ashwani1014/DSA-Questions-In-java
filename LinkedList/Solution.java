public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode f = head;
        ListNode s = head;

        // Step 1: Cycle detect
        while (f != null && f.next != null) {

            s = s.next;
            f = f.next.next;

            if (s == f) {

                // Step 2: Find cycle beginning
                ListNode temp = head;

                while (temp != s) {
                    temp = temp.next;
                    s = s.next;
                }

                return temp;
            }
        }

        // No cycle
        return null;
    }
}