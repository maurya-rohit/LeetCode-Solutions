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
        if(headA==null || headB==null) return null;
        ListNode dummy1=headA;
        ListNode dummy2=headB;
        int countA=0,countB=0;
        ListNode lA=null;
        ListNode lB=null;
        if(headA.next==null){
            while(headB!=null){
                if(headA==headB){
                    return headA;
                }
                headB=headB.next;
            }
            return null;
        }
        if(headB.next==null){
             while(headA!=null){
                if(headA==headB){
                    return headB;
                }
                headA=headA.next;
            }
            return null;
        }
        int i=0;
        while(i<3) {
        while(headA!=null && headB!=null){
           // System.out.println("PPPPP"+headA.val+"sfffff"+headB.val);
            if(headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
       if(headA==null){
           headA=dummy2;
       }
        else if(headB==null){
            headB=dummy1;
        }
            i++;
        }
        return null;
    }
}
