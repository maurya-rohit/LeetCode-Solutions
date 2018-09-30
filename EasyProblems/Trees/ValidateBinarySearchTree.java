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
    public boolean isValidBST(TreeNode root) {
       
        return isValidCheck(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    public boolean isValidCheck(TreeNode root,int max,int min){
        if(root==null) return true;
         System.out.println("Check this"+min);
        if(root.val==Integer.MIN_VALUE && root.left!=null) return false;
        if(root.val==Integer.MAX_VALUE && root.right!=null) return false;
        if(root.val<min || root.val>max)
            return false;
        
        return (isValidCheck(root.left,root.val-1,min) && isValidCheck(root.right,max,root.val+1));
    }
}
