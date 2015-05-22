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
        if(null == head)
            return null;
        
        ListNode curr = head.next;
        ListNode prev = head;
        while(curr != null){
            ListNode temp = curr.next;
            //prev.next = null;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        head.next = null;
        
        return prev;
    }
}