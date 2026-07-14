package LinkedList;

public class RemoveDublicate83 {
    
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode node=head;
        while(head.next!=null){
            if(head.val==head.next.val){
             head.next=head.next.next;
            }
            else{
                head=head.next;
            }
        }
        return node;


    }
}
 