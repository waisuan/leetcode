/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        boolean isCycle = false;
        
        while(p1 != null && p2 != null){
            p1 = p1.next;
            if(p2.next == null)
                return null;
            p2 = p2.next.next;
            if(p1 == p2){
                isCycle = true;
            
                break;
            }
        }
        
        if(!isCycle)
            return null;
            
        p1 = head;
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return p1;
    }
}