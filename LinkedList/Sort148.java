package LinkedList;

import LinkedList.Cycle141.ListNode;

public class Sort148 {
     public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; next = null; }
    }
 
  public ListNode sortList(ListNode head) {

        
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeSort(left, right);

    }   

    public ListNode mergeSort(ListNode list1, ListNode list2) {
        
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            }
            
             else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        if (list1 != null) {
            tail.next = list1;
        }

        if (list2 != null) {
            tail.next = list2;
        }

        return dummy.next;
    }



   public ListNode middleNode(ListNode head) {

    ListNode slow = head;
    ListNode fast = head;
    ListNode prev = null;


    while (fast != null && fast.next != null) {

        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }

    prev.next = null;

    return slow;

}
}

