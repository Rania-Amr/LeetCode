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
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre =null;
        ListNode l = head;
        while(l != null){
           ListNode temp = l.next;
           l.next=pre;
            pre =l;
            l =temp;
        }
        return pre;
    }
}