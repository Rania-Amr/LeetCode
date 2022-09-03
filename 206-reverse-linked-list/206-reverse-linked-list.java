/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/**
1 -> 2-> 3-> 4-> 5->null
p2 =null

---loop on null
l1 1 
p1  =l1.next
l1.next =p2

p2 = l1
l1=p1
->l1

l1 2
p1-> 2
p1.next =null
 p2 = 1 

1 ->null

5 ->4->3->2->1 -> null



*/
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode l1 =head;
        ListNode prev=null;
        
            while(l1 !=null){
              ListNode NextValue =l1.next;
                l1.next =prev;
                prev =l1;
                l1 = NextValue;
                
            }
        return prev;
    }
}