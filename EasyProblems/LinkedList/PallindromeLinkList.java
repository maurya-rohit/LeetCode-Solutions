/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
   ListNode slow_ptr=head;
    ListNode fast_ptr=head;
    ListNode midNode=null;
        ListNode prev=head;
            while(fast_ptr!=null && fast_ptr.next!=null) {
                fast_ptr=fast_ptr.next.next;
                prev=slow_ptr;
                slow_ptr=slow_ptr.next;
            }
        if(fast_ptr!=null){
          midNode=slow_ptr;
            slow_ptr=slow_ptr.next;
            
        }
    ListNode second_half=slow_ptr;
      
        prev.next=null;
      ListNode reversedList = reverse(second_half);
        return checkForEqual(head,reversedList);
}
    public ListNode reverse(ListNode second_half){
        
        if(second_half==null || second_half.next==null) return second_half;
         System.out.println("NOw "+ second_half.next.val);
        ListNode resultList= reverse(second_half.next);
        second_half.next.next=second_half;
        second_half.next=null;
         
        return resultList;
    }
    public boolean checkForEqual(ListNode head, ListNode second_half){
        while(head!=null || second_half!=null){
            System.out.println("something"+ second_half.val);
            if(head.val!=second_half.val)
                return false;
            head=head.next;
            second_half=second_half.next;
        }
        return true;
    }
}
