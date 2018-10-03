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
    public List<List<Integer>> levelOrder(TreeNode root) {
 List<List<Integer>> answer =new ArrayList<List<Integer>>();
        if(root==null)
            return answer;
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        q.offer(root);
        int size=0;
        while(!q.isEmpty()){
            size=q.size();
            List<Integer> singleLevel=new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode t = q.poll();
                singleLevel.add(t.val);
                if(t.left!=null)
                    q.offer(t.left);
                if(t.right!=null)
                    q.offer(t.right);
            }
            answer.add(singleLevel);
        }
        return answer;
}
}
