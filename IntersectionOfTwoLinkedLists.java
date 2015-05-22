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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //hashset can be used as an alternative solution here. store headA values and then traverse headB to match.
        if(null == headA || null == headB)
            return null;
        //assumption: linked list is sorted (asc).
        int valA = headA.val;
        int valB = headB.val;
        
        if(valA == valB)
            return headA;
        
        ListNode startWith = valA < valB? headA : headB;
        ListNode oppNode = valA > valB? headA : headB;
        valA = startWith.val;
        valB = oppNode.val;
        
        while(startWith != null){
            valA = startWith.val;
            if(valA == valB){
                return startWith;
            } else if(valA > valB){
                if(oppNode.next != null){
                    oppNode = oppNode.next;
                    valB = oppNode.val;
                } else
                    return null;
            } else if(valA < valB){
                startWith = startWith.next;
            }
        }
        
        return null;
    }
}