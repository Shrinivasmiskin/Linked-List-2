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
        int lenA = 0;
        int lenB = 0;
        ListNode slow = headA; //slow as head of headA
        ListNode fast = headB; ////slow as head of headB
        
        while(slow != null){  // get the length of List A
            slow = slow.next;
            lenA++;
        }
        slow = headA;
        while(fast != null){ // get the length of List B
            fast = fast.next;
            lenB++;
        }
        fast = headB;
        while(lenA > lenB){ 
            slow = slow.next;
            lenA--;
        }
        while(lenB > lenA){
            fast = fast.next;
            lenB--;
        }
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
      
    }
}
