/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // APRROACH 1 :  Brute force tc: o(m*n)
        ListNode currA=headA;
        ListNode currB=headB;

        while(currA!=null){
            // har baar jb iterate hoke aayega curr a ke 
            //sth check krne ke baad tb phir se head b assign kr dege
            currB=headB;
            while(currB!=null){
                if(currA==currB){
                    return currA;
                }
                currB=currB.next;
            }
            currA=currA.next;
        }
        return null;
        
    }
}