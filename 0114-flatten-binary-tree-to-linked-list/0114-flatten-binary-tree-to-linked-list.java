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
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        flattentree(root);
    }
    void flattentree(TreeNode node){
        if(node == null){
            return;
        }
        flattentree(node.right);
        flattentree(node.left);
        node.right = prev;
        node.left = null;
        prev = node;
    }
}