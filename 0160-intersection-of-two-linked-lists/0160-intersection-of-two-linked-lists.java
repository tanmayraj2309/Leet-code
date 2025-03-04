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





      /// Approach 3 : simply we find the length of both the linked list 
      // after that jisk large length - small length krgee 
      // after that jo big length list usko wha se traverse krna suru krege jo 
      //bhi subtaraction of length ka result aaya hai then check krege b ke sath 
      //whether they will meet or not

    //   ListNode currA = headA;
    //   ListNode currB= headB;
    //   int lenA=0;
    //   int lenB=0;
    //   while(currA!=null){
    //     lenA++;
    //     currA=currA.next;
    //   }
    //   while(currB!=null){
    //     lenB++;
    //     currB=currB.next;
    //   }
    //   currA=headA;
    //   currB=headB;
    //   int diff=Math.abs(lenA-lenB);

    //   if(lenA>lenB){
    //     int i=0;
    //     while(i<diff){
    //         currA=currA.next;
    //         i++;
    //     }
    //   }
    //   else{
    //     int i=0;
    //     while(i<diff){
    //         currB=currB.next;
    //         i++;
    //     }
    //   }

    //   while(currA!=currB){
    //     currA=currA.next;
    //     currB=currB.next;
    //   }
    //   return currA;





        // Approach 3 : Two Poninter   // dist= travel of a =x+y+z; travel of b=z+y+x// similar as 3+2=5; 2+3=5
        //    if(headA==null || headB==null) return null;
           ListNode temp1=headA;
           ListNode temp2=headB;
           while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
            if(temp1==temp2) return temp1;
            if(temp1==null) temp1=headB;  /// cross head pe jayega
            if(temp2==null) temp2=headA;  /// cross head pe jayega
           }
           return temp1;
        
    }
}