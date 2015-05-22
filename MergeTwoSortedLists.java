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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(null == l1 && null == l2){
            return null;
        }
        
        if(null == l1){
            return l2;
        }
        
        if(null == l2){
            return l1;
        }
        
        ListNode curr1 = l1;
        ListNode prev1 = curr1;
        ListNode curr2 = l2;
        ListNode prev2 = curr2;
        while(curr1 != null && curr2 != null){
            if(curr1.val >= curr2.val){
                //ListNode temp = curr2.next;
                if(prev1 == curr1){
                    ListNode newNode = new ListNode(curr2.val);
                    newNode.next = curr1;
                    //prev1.next = curr1;
                    prev1 = newNode;
                    //ListNode temp = curr1;
                    l1 = newNode;
                    //curr1 = temp;
                }else{
                    ListNode newNode = new ListNode(curr2.val);
                    
                    prev1.next = newNode;
                    prev1 = newNode;
                    
                    newNode.next = curr1;
                }
                
                curr2 = curr2.next;
            }else if(curr1.val < curr2.val){
                prev1 = curr1;
                curr1 = curr1.next;
            }
        }
        
        if(curr1 == null && curr2 != null){
            prev1.next = curr2;
            // while(curr2 != null){
                
            // }
        }
        
        return l1;
    }
}