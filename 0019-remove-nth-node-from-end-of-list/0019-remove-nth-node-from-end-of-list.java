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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         
         // Aprroach 1 in 2  iteration Brute Force 

         ListNode temp=head;
         int count=0;
         while(temp!=null){
            count++;
            temp=temp.next;
         }
         if(n==count){
            head=head.next;
            return head;
         }
         int len=count-n+1;

         count=1;
         temp=head;

         while(temp!=null){
            count++;
            if(count==len){
                break;
            }
            temp=temp.next;
         }
         temp.next=temp.next.next;
         return head;
        // make sentinel node 
        // ListNode phead= new ListNode(0);
        // phead.next=head;
        // ListNode temp=phead;
        // ListNode curr= head;
        // int len=0;
        // while(curr!=null){
        //     len++;
        //     curr=curr.next;
        // }
        // int diff=len-n;
        // for(int i=0;i<diff;i++){
        //     temp=temp.next;
        // }
        // temp.next=temp.next.next;
        //  return phead.next;

        
    }
}