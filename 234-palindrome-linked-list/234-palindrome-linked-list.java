/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
  [1,2,2,1]
  fast 1 2 2
  slow 1 2 2
  2 ,1
   revers
   pre null
   temp l.next
   l.next=prev
   prev =l;
    whikle  null
    return ==
 
 
 
 
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast =head;
        ListNode slow =head;
        while(fast !=null && fast.next !=null){
            fast =fast.next.next;
            slow =slow.next;
        }
        ListNode prev =null;
        ListNode l1 =slow;
        while(l1 !=null){
            ListNode temp =l1.next;
            l1.next =prev;
            prev =l1;
            l1=temp;
        }
        ListNode reversed =prev;
        ListNode p1 =head;
        while(reversed !=null ){
            if( reversed.val != p1.val){
                return false;
            }
            reversed =reversed.next;
            p1 =p1.next;
        }
        return true;
    }
}