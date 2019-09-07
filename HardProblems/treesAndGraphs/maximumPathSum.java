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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       check(root);
           return max;
    }
    public int check(TreeNode root){
        if(root==null) return 0;
        int left=Math.max(0,check(root.left));
        int right=Math.max(0,check(root.right));
        System.out.println(left+"    "+right+"    "+max);
        max=Math.max(left+right+root.val,max);
        return Math.max(left,right)+root.val;
    }
   
                            }


