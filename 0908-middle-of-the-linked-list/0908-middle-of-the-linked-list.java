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
    public ListNode middleNode(ListNode head) {
        // int n =0;
        // ListNode temp=head;
        // while(temp!=null){
        //     n++;
        //     temp=temp.next;
        // }
        // temp=head;
        // for(int i=0;i<n/2;i++){
        //     temp=temp.next;
        // }
        // return temp;










        // 2nd approach 
         // Write your code here.
         // brute force:  count and taverse till n/2 and return node
        // hare tortoise algo  = make slow and fast pointer move slow by one step and fast by two step and
        // for odd length traverse till  fast!=null last node pe jake rukega . even length ke liye fast.next!null 
         
        ListNode slow= head;
        ListNode fast=head;

         while(fast!=null && fast.next!= null){
             slow=slow.next;
             fast= fast.next.next;
         }
         return slow;
    } 
}