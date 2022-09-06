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

        ListNode slow =head;
        ListNode fast =head;
        int k =-1;
        while(fast  !=null && fast.next !=null){
          slow =slow.next;
          fast =fast.next.next;
          if(slow == fast){
               k =calcuateLengthOfCycle(slow);
               break;
          }
        }
        if(k == -1){
            return null;
        }
        ListNode p1 =head;
        ListNode p2 =head;
        while(k>0){
          p1=p1.next;
          k--;
        }
        while(p1 !=p2){
          p1 =p1.next;
          p2 =p2.next;
        }
    
    // TODO: Write your code here
     return p1;
  }
   public  int calcuateLengthOfCycle(ListNode head) {
        ListNode slow =head;
        int count =0;

        do{
            slow  =slow.next;
            count++;
        }while(slow  !=head);
        // TODO: Write your code here
        return count;
  }
}