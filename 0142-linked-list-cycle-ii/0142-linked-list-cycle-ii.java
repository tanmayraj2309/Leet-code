/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Aprroach1 : HAshset tc= o(n),Sc=o(n)
        // HashSet<ListNode>  set= new HashSet<>();
        // ListNode curr= head;
        // while(curr!=null){
        //     if(set.contains(curr)){
        //         return curr;
        //     }
        //     set.add(curr);
        //     curr=curr.next;
        // }
        // return null;


        // Approach 2 :Floyd Hare and Tortoise Algorithm
        ListNode curr= head;
        ListNode slow= head;
        ListNode fast=head;
        // check krega yha ki circular linked list hai ki nhi 

        while(fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        // yha pe check krege kha se suru hua hai cyclic ll
        while(curr!=slow){
            curr=curr.next;
            slow=slow.next;
        }
        return curr;


        
    }
}