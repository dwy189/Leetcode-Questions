/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pointer = head;
        ListNode result = new ListNode(pointer.val);
        ListNode temp = result;
        while(pointer.next != null) {
            pointer = pointer.next;
            result = new ListNode(pointer.val);
            result.next = temp;
            temp = result;
        }
        return result;
    }
}
