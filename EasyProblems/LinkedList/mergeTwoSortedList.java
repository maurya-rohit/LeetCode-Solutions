/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode d1=new ListNode(0);
        ListNode d2=new ListNode(0);
        d1=l1;
        d2=l2;
        ListNode answer = new ListNode(-1);
        ListNode head=answer;
        while(d1!=null && d2!=null){
            if(d1.val>=d2.val){
                ListNode newNode=new ListNode(d2.val);
                answer.next=newNode;
                answer=newNode;
                d2=d2.next;
            }else{
                 ListNode newNode=new ListNode(d1.val);
                answer.next=newNode;
                answer=newNode;
                d1=d1.next;
            }
        }
        if(d1!=null){
            while(d1!=null){
                 ListNode newNode=new ListNode(d1.val);
              answer.next=newNode;
                answer=newNode;
                d1=d1.next;}
        }else
        { while(d2!=null){
             ListNode newNode=new ListNode(d2.val);
              answer.next=newNode;
                answer=newNode;
                d2=d2.next;
            
        }
        
    }
        return head.next;
}
}
