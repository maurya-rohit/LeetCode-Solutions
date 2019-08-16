/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
   
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> answer=new ArrayList<>();
       Stack<TreeNode> s=new Stack<>(); 
        TreeNode cur=root;
    while(!s.isEmpty() || cur!=null){
        while(cur!=null){
            s.push(cur);
            cur=cur.left;
        }
        cur=s.pop();
        answer.add(cur.val);
        cur=cur.right;
    }
        return answer;
    }
}
