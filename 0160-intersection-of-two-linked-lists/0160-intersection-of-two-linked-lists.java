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
        // ListNode currA=headA;
        // ListNode currB=headB;

        // while(currA!=null){
            // har baar jb iterate hoke aayega curr a ke 
            //sth check krne ke baad tb phir se head b assign kr dege
        //     currB=headB;
        //     while(currB!=null){
        //         if(currA==currB){
        //             return currA;
        //         }
        //         currB=currB.next;
        //     }
        //     currA=currA.next;
        // }
        // return null;


      
      // Aprroach 2 : HASHSET APPROACH
    //    Set<ListNode> set = new HashSet<>();
    //    ListNode currA=headA,
    //    currB=headB;

    //    while(currA!=null){
    //     set.add(currA);
    //     currA=currA.next;
    //    }

    //    while(currB!=null){
    //     if(set.contains(currB)){
    //         return currB;
    //     }
    //     currB=currB.next;
    //    }

    //     return null;


    // Approach 3 : Two Poninter   // dist= travel of a =x+y+z; travel of b=z+y+x// similar as 3+2=5; 2+3=5
     ListNode currA=headA,
      currB=headB;
      while(currA!=currB){
        currA=currA==null ?headB: currA.next;
        currB= currB==null ? headA : currB.next;
      }
      return currA;

        
    }
}