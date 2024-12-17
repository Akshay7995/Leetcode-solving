/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int sum = 0;
        while(!q.isEmpty()){
            int level = q.size();
            TreeNode currnode = q.poll();
            if(currnode.left !=null && currnode.left.left == null && currnode.left.right == null){
                sum += currnode.left.val;
            }
            if(currnode.left != null){
                q.offer(currnode.left);
            }
            if(currnode.right != null){
                q.offer(currnode.right);
            }
        }
        return sum;
    }
}