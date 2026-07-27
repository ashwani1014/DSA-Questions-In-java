package LinkedList;

public class ReorderList143 {
    

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
    


    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }

        ListNode middle=middleNode(head);
        ListNode hs=reverse(middle);
        ListNode hf=head;
         
        while(hf!=null&& hs!=null){
            
          ListNode  temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;

            
            

        }
        if (hf != null) {
        hf.next = null;
    }
    
    }
}
 
