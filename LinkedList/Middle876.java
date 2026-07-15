package LinkedList;

public class Middle876 {
    


class Solution {
    
        int length = 0;
        ListNode temp = head;
        int n = 0;
        while (head != null) {
            length++;
            head = head.next;
        }

        if (length == 0) {
            return head;
        } else {
            n = length / 2;
        }

        while (n > 0) {

            temp = temp.next;
            n--;
        }

        return temp;

    }
}
    
 
