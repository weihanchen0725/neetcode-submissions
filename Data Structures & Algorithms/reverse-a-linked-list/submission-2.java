class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next; // 暫存下一個
            curr.next = prev;         // 箭頭反轉
            prev = curr;              // prev 往前推
            curr = next;              // curr 往前推
        }
        return prev;
    }
}