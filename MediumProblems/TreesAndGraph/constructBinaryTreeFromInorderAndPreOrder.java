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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder,inorder,0,inorder.length-1,0);
    }
    public TreeNode buildTree(int[] preorder, int[] inorder, int inStart, int inEnd, int preIndex){
        if(inStart>inEnd || preIndex>preorder.length)
            return null;
        TreeNode newNode=new TreeNode(preorder[preIndex]);
        if(inStart==inEnd) return newNode;
        int inIndex=search(inorder,inStart,inEnd,newNode.val);
        newNode.left=buildTree(preorder,inorder,inStart,inIndex-1,preIndex+1);
        newNode.right=buildTree(preorder,inorder,inIndex+1,inEnd,preIndex+inIndex-inStart+1);
        return newNode;
    }
    public int search(int[] inorder,int inStart,int inEnd,int val){
        int i;
        for(i=inStart;i<inEnd;i++){
            if(inorder[i]==val){
                return i;
            }
        }
        return i;
    }
   
}
