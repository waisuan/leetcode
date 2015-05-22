/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(null == head)
            return null;
            
        while(head != null && head.val == val){
            head = head.next;
        }
        
        ListNode curr = head;
        while(curr != null){
            if(curr.next != null && curr.next.val == val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        
        return head;
    }
}