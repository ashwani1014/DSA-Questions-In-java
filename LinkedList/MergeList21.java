package LinkedList;

// LeetCode 21: Merge Two Sorted Lists
public class MergeList21 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode ans = new ListNode();
        ListNode temp = ans;

        ListNode f = list1;
        ListNode s = list2;

        while (f != null && s != null) {

            if (f.val < s.val) {
                ans.next = f;
                f = f.next;
            } else {
                ans.next = s;
                s = s.next;
            }
            ans = ans.next;
        }

        while (f != null) {
            ans.next = f;
            f = f.next;
            ans = ans.next;
        }

        while (s != null) {
            ans.next = s;
            s = s.next;
            ans = ans.next;
        }

        return temp.next;
    }
}