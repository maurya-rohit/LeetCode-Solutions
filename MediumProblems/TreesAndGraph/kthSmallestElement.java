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
    private int numElements;
    private int answer;
    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return answer;
    }
    public void helper(TreeNode root, int k){
        if(root==null) return ;
        helper(root.left,k);
        if(++numElements==k) answer= root.val;
        helper(root.right,k);
    }
}
