/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 1-> 2-> 3 -> 4
 temp =3
 head= 4
 
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        return helper(head);
    }
    
     public ListNode helper(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
       ListNode nextValue=  helper(head.next.next);
         
         ListNode temp = head;
         head = head.next;
        head.next = temp;
         head.next.next =nextValue;
         
         return head;
         
    }
}