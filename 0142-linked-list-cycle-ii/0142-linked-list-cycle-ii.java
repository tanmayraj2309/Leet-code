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
        HashSet<ListNode>  set= new HashSet<>();
        ListNode curr= head;
        while(curr!=null){
            if(set.contains(curr)){
                return curr;
            }
            set.add(curr);
            curr=curr.next;
        }
        return null;

        
    }
}