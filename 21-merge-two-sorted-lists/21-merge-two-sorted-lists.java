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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l3 = new ListNode(-1);
        ListNode l4 = l3;
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                l3.next = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                l3.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            l3 = l3.next;
        }
        if(list1 != null){
            l3.next = list1;
        }
        if(list2 != null){
            l3.next = list2;
        }
        return l4.next;
    }
}