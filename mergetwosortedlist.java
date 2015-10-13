/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while(pointer1 != null || pointer2 != null) {
            if (pointer1 == null) {
                temp.next = new ListNode(pointer2.val);
                pointer2 = pointer2.next;
            } else if (pointer2 == null){
                temp.next = new ListNode(pointer1.val);
                pointer1 = pointer1.next;
            } else if (pointer1.val <= pointer2.val) {
                temp.next = new ListNode(pointer1.val);
                pointer1 = pointer1.next;
            } else if (pointer1.val > pointer2.val) {
                temp.next = new ListNode(pointer2.val);
                pointer2 = pointer2.next;
            }
            
            temp = temp.next;
        }
        return result.next;
        
    }
}
