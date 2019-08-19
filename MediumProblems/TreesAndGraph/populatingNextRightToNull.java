/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        List<TreeLinkNode> answer=new ArrayList<>();
        if(root==null) return;
        answer.add(root);
        while(!answer.isEmpty()){
            int size=answer.size();
             System.out.println("jhfhfgsdasa"+answer.size());
            for(int i=0;i<size;i++){
                System.out.println("j"+i);
                  TreeLinkNode current=answer.remove(0);
                if(i==size-1){
                  current.next=null;
                }else {
                    current.next=answer.get(0);
                }
                if(current.left!=null){
                  //  System.out.println("jgfbfvd");
                    answer.add(current.left);
                    }
                if(current.right!=null){
                    answer.add(current.right);
                    
                }
               
            }
            
        }
    }
}
