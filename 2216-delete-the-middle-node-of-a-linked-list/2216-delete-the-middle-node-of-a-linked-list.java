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
    public ListNode deleteMiddle(ListNode head) {
        // brute force traverse find length and and traverse till n/2 delete that node and return head
        // by  hare and totoise algo


        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast= head;
        ListNode slow= head;
        fast= head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        slow.next=slow.next.next;
        return head;

        
    }
}