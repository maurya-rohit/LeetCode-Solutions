/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.val==0 && l1.next==null) return l2;
        if(l2.val==0 && l2.next==null) return l1;
        ListNode dummy=new ListNode(-1);
        ListNode dummy1=dummy;
        int carry=0;
        
        while(l1!=null && l2!=null) 
        {
            int sum=l1.val+l2.val+carry;
           // System.out.println("Ye "+sum);
            if(sum>=10){
                carry=sum/10;
                sum=sum%10;
            }
            else
                carry=0;
            ListNode newNode=new ListNode(sum);
            dummy1.next=newNode;
            dummy1=dummy1.next;
            l1=l1.next;
            l2=l2.next;
            }
        
        
        if(l1!=null){
            while(l1!=null){
             int sum=l1.val+carry;
            if(sum>=10){
                carry=sum/10;
                sum=sum%10;
            }
            else
                carry=0;
            ListNode newNode=new ListNode(sum);
            dummy1.next=newNode;
            dummy1=dummy1.next;
            l1=l1.next;
        }}else if(l2!=null){
            while(l2!=null){
            int sum=l2.val+carry;
            if(sum>=10){
                carry=sum/10;
                sum=sum%10;
            }
            else
                carry=0;
            ListNode newNode=new ListNode(sum);
            dummy1.next=newNode;
            dummy1=dummy1.next;
            l2=l2.next;
        }}
        
        if(carry>0){
            ListNode newNode=new ListNode(carry);
            dummy1.next=newNode;
        }
        return dummy.next;
    }
    
}
