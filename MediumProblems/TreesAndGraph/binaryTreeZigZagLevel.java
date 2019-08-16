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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Queue<TreeNode> que=new LinkedList<>();
        List<List<Integer>> answer = new ArrayList<>();
        if(root==null) return answer;
        que.offer(root);
        while(!que.isEmpty()){
            int size=que.size();
            List<Integer> one=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=que.poll();
                one.add(node.val);
                if(node.left!=null){
                    que.offer(node.left);
                }
                if(node.right!=null){
                    que.offer(node.right);
                }
                }
            answer.add(one);
        }
          for(int j=1;j<answer.size();j+=2){
        Collections.reverse(answer.get(j));
    }
    return answer;
    }
  
}
