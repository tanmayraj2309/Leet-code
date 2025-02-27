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








 /// approach of sloving this qn :
 // brute force =  simply put into stack and do comaparision
 // optimal:  first Step:  find middle of the list (hare and tortoise algo)
 // 2nd step : reverese after part of  the middle node of linked list
 // 3rd step : start comparing from last node to first node 
class Solution {
    public static ListNode reverse(ListNode head){
      
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode  currp1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currp1;
        }
        
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
         
         ListNode slow= head;
         ListNode fast=head;
         while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         }

         ListNode newhead=reverse(slow);
         ListNode first=head;
         ListNode second=newhead;
        while(second!=null){
            if(first.val!=second.val){
                reverse(newhead);// fix the reverse part
                return false;
            }
            first=first.next;
            second=second.next;
        }
          reverse(newhead);
        return true;

        
    }
}