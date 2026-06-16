class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode middle = middle(head);
        ListNode head2 = reverse(middle.next);

        while(head2 != null) {
            if(head.val != head2.val) return false;

            head = head.next;
            head2 = head2.next;
        }

        return true;
    }

    public ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}