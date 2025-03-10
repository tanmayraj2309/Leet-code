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
    public ListNode rotateRight(ListNode head, int k) {
        if(head== null || head.next==null || k==0) return head;
        int len=1;
        ListNode tail= head;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
   
        k=k%len;
        if (k == 0) return head;

        tail.next=head;
        
        int newlen=len-k-1;
        ListNode newTail=head;
        for(int i=0;i<newlen;i++){
           newTail=newTail.next;
        }
        head=newTail.next;
        newTail.next=null;
        return head;




        
    }
}