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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return helper(root,targetSum,sum);
    }
    boolean helper(TreeNode node,int targetSum,int sum){
        if(node == null){
            return false;
        }
        sum = sum+node.val;
        if(node.left == null && node.right == null){
            return targetSum == sum;
        }
        return helper(node.left,targetSum,sum) || helper(node.right,targetSum,sum);
    }
}