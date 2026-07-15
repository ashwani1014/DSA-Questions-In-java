package LinkedList;

public class 142Linked {
     
    

    public ListNode detectCycle(ListNode head) {

        ListNode f = head;
        ListNode s = head;
        int length=0;

        while (f != null && f.next != null) {

            f = f.next.next;
            s = s.next;
            if (f == s) {
            ListNode temp=s;
            temp=temp.next;
             length=1;
            while(temp!=f){
            length++;
            temp=temp.next;
            }
            break;

            }

        }
         if (length == 0) {
            return null;
        }

        ListNode a=head;
        ListNode b=head;
        while(length>0){
            b=b.next;
            length--;
        }

        while(a!=b){
            a=a.next;
            b=b.next;
        }


        return a;
    }
}

 
