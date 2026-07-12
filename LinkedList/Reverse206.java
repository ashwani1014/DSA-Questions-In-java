package LinkedList;
java.util.*;
public class Reverse206 {
    

     
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
 
