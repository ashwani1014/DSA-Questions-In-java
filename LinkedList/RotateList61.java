public ListNode rotateRight(ListNode head, int k) {

    if (head == null || head.next == null || k == 0)
        return head;

    for (int i = 0; i < k; i++) {

        ListNode temp = head;
        ListNode prev = null;

        // last node find karo
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        // last node ko remove karo
        prev.next = null;

        // last node ko front mein lagao
        temp.next = head;
        head = temp;
    }

    return head;
}