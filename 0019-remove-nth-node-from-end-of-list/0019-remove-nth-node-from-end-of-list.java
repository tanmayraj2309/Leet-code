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

        //  ListNode temp=head;
        //  int count=0;
        //  while(temp!=null){
        //     count++;
        //     temp=temp.next;
        //  }
        //  if(n==count){
        //     head=head.next;
        //     return head;
        //  }
        //  int len=count-n+1;

        //  count=1;
        //  temp=head;

        //  while(temp!=null){
        //     count++;
        //     if(count==len){
        //         break;
        //     }
        //     temp=temp.next;
        //  }
        //  temp.next=temp.next.next;
        //  return head;



        // 2nd approach in one iteration  simply we take two pointer slow and fast 
        // make fast traverse till n then incement  slow and fast by 1,1 and till fast.next!=null
        // automaticatically by calculation slow pointer just 1 place ahead of deleting desired node


        ListNode slow=head;
        ListNode fast=head;

        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null) return head.next;

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;

        
    }
}