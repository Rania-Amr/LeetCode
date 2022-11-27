/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 check null
 add them
 put sum 
 keep track the rest to add them
 
 
 */
class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l4 = new ListNode(-1);
        ListNode l3 = l4;
        int num1 =0;
        int num2 =0;
        int sum=0;
        int rest =0;
        
        while(l1 != null ||  l2 !=null || rest !=0){
            if(l1 !=null){
             num1= l1.val;
             l1=l1.next;
            }else{
                num1=0;
            }
            if(l2 !=null){
             num2= l2.val;
             l2=l2.next;
            }else{
                num2=0;
            }
            
            
        sum =num1+num2+rest;
        rest =sum/10;
        sum =sum%10;
            l3.next=new ListNode(sum);
            l3=l3.next;
        }
        return l4.next;
    }
}