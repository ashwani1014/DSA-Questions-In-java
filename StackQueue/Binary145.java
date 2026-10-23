class Solution {
    public int getDecimalValue(ListNode head) {

        int num = 0;
        int length = getLength(head);
        int i = length - 1;

        while (head != null) {
            num = num + (head.val) * (int) Math.pow(2, i);

            head = head.next;
            i--;
        }

        return num;
    }

    public int getLength(ListNode head) {
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}