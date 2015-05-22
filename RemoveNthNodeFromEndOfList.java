/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;
            
        if(head.next == null && n == 1)
            return null;
            
        ListNode beforeHead = new ListNode(0);
        beforeHead.next = head;
        ListNode curr = beforeHead;
        ListNode pointer = curr;
        int i = 0;
        while(i < n && null != curr.next){
            curr = curr.next;
            i++;
        }
        
        while(null != curr.next){
            pointer = pointer.next;
            curr = curr.next;
        }
        
        if(pointer != null && pointer.next != null)
            pointer.next = pointer.next.next;
        
        return beforeHead.next;
    }
}