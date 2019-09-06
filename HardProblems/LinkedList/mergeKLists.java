/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
      PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>((x,y)->x.val-y.val);
        ListNode current=null;
        ListNode head=null;
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null)
            pq.offer(lists[i]);
        }
        while(!pq.isEmpty()){
            ListNode top=pq.poll();
        if(current==null){
            current=new ListNode(top.val);
         head=current;
        }else{
            ListNode naya=new ListNode(top.val);
            current.next=naya;
            current=current.next;
        }
            
            if(top.next!=null){
                pq.offer(top.next);
            }
        }
    return head;
        
    }
}
