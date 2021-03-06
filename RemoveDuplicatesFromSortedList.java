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
    public ListNode deleteDuplicates(ListNode head) {
        if(null == head)
            return null;
        
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null){
            if(prev.val == curr.val){
                prev.next = curr.next;
            }else{
                prev = prev.next;
            }
            
            curr = curr.next;
        }
        
        return head;
    }
}